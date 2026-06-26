package pl.allegro.finance.tradukisto.internal.languages.finnish;

import static java.util.Collections.reverse;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import pl.allegro.finance.tradukisto.internal.IntegerToStringConverter;
import pl.allegro.finance.tradukisto.internal.LongToStringConverter;
import pl.allegro.finance.tradukisto.internal.languages.PluralForms;
import pl.allegro.finance.tradukisto.internal.support.Assert;
import pl.allegro.finance.tradukisto.internal.support.NumberChunking;

public class FinnishNumberToWordsConverter implements IntegerToStringConverter, LongToStringConverter {

    private static final int THOUSAND = 1000;
    private static final int MILLION = 1000000;

    private final NumberChunking numberChunking = new NumberChunking();
    private final Map<Integer, String> baseNumbers;
    private final List<PluralForms> pluralForms;

    public FinnishNumberToWordsConverter(
        Map<Integer, String> baseNumbers,
        List<PluralForms> pluralForms
    ) {
        this.baseNumbers = baseNumbers;
        this.pluralForms = pluralForms;
    }

    @Override
    public String asWords(Integer value) {
        return asWords(value.longValue());
    }

    @Override
    public String asWords(Long value) {
        Assert.isTrue(value >= 0, () -> String.format("can't convert negative numbers for value %d", value));

        if (value == 0) {
            return baseNumbers.get(0);
        }

        if (value < MILLION) {
            return smallNumberAsWords(value.intValue());
        }

        return largeNumberAsWords(value);
    }

    private String largeNumberAsWords(Long value) {
        List<Integer> valueChunks = numberChunking.chunk(value);
        List<PluralForms> formsToUse = getRequiredFormsInReversedOrder(valueChunks.size());
        List<String> result = new ArrayList<>();

        for (int i = 0; i < valueChunks.size(); i++) {
            Integer currentChunk = valueChunks.get(i);
            PluralForms currentForms = formsToUse.get(i);

            if (currentChunk > 0) {
                result.add(chunkWithForm(currentChunk, currentForms));
            }
        }

        return String.join(" ", result).trim();
    }

    private List<PluralForms> getRequiredFormsInReversedOrder(int chunks) {
        List<PluralForms> formsToUse = new ArrayList<>(pluralForms.subList(0, chunks));
        reverse(formsToUse);
        return formsToUse;
    }

    private String chunkWithForm(Integer value, PluralForms forms) {
        String form = forms.formFor(value);

        if (form.isEmpty()) {
            return smallNumberAsWords(value);
        }

        if ("tuhat".equals(form)) {
            return form;
        }

        if ("tuhatta".equals(form)) {
            return smallNumberAsWords(value) + form;
        }

        if (value == 1) {
            return form;
        }

        return smallNumberAsWords(value) + " " + form;
    }

    private String smallNumberAsWords(Integer value) {
        if (baseNumbers.containsKey(value)) {
            return baseNumbers.get(value);
        }

        if (value < 20) {
            return baseNumbers.get(value % 10) + "toista";
        }

        if (value < 100) {
            return twoDigitsNumberAsString(value);
        }

        if (value < THOUSAND) {
            return threeDigitsNumberAsString(value);
        }

        return thousandsAsString(value);
    }

    private String twoDigitsNumberAsString(Integer value) {
        Integer units = value % 10;
        Integer tens = value / 10;
        String words = baseNumbers.get(tens) + "kymmentä";

        return units == 0
            ? words
            : words + smallNumberAsWords(units);
    }

    private String threeDigitsNumberAsString(Integer value) {
        Integer tensWithUnits = value % 100;
        Integer hundreds = value / 100;
        String words = hundreds == 1
            ? "sata"
            : baseNumbers.get(hundreds) + "sataa";

        return tensWithUnits == 0
            ? words
            : words + smallNumberAsWords(tensWithUnits);
    }

    private String thousandsAsString(Integer value) {
        Integer rest = value % THOUSAND;
        Integer thousands = value / THOUSAND;
        String words = thousands == 1
            ? "tuhat"
            : smallNumberAsWords(thousands) + "tuhatta";

        return rest == 0
            ? words
            : words + smallNumberAsWords(rest);
    }
}
