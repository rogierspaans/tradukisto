package pl.allegro.finance.tradukisto.internal.languages.danish;

import static java.lang.String.format;

import java.util.Map;

import pl.allegro.finance.tradukisto.internal.GenderAwareIntegerToStringConverter;
import pl.allegro.finance.tradukisto.internal.languages.GenderForms;
import pl.allegro.finance.tradukisto.internal.languages.GenderType;
import pl.allegro.finance.tradukisto.internal.support.Range;

public class DanishThousandToWordsConverter implements GenderAwareIntegerToStringConverter {

    private final Map<Integer, GenderForms> baseValues;

    public DanishThousandToWordsConverter(Map<Integer, GenderForms> baseValues) {
        this.baseValues = baseValues;
    }

    @Override
    public String asWords(Integer value, GenderType genderType) {
        if (baseValues.containsKey(value)) {
            return baseValues.get(value).formFor(genderType);
        } else if (Range.closed(21, 99).contains(value)) {
            return twoDigitsNumberAsString(value, genderType);
        } else if (Range.closed(101, 999).contains(value)) {
            return threeDigitsNumberAsString(value, genderType);
        } else if (Range.closed(1000, 999999).contains(value)) {
            return thousandsAsString(value, genderType);
        }

        throw new IllegalArgumentException(format("Can't convert %d", value));
    }

    private String twoDigitsNumberAsString(Integer value, GenderType genderType) {
        Integer units = value % 10;
        Integer tens = value - units;

        return format("%sog%s", asWords(units, genderType), asWords(tens, genderType));
    }

    private String threeDigitsNumberAsString(Integer value, GenderType genderType) {
        Integer tensWithUnits = value % 100;
        Integer hundreds = value - tensWithUnits;

        if (hundreds == 100 && tensWithUnits < 20) {
            return format("et %s %s", asWords(hundreds, genderType), asWords(tensWithUnits, genderType));
        }

        return format("%s %s", asWords(hundreds, genderType), asWords(tensWithUnits, genderType));
    }

    private String thousandsAsString(Integer value, GenderType genderType) {
        int thousands = value / 1000;
        Integer other = value % 1000;

        if (thousands == 1) {
            return oneThousandAsWords(other, genderType);
        }

        return thousandsAsWords(thousands, other, genderType);
    }

    private String thousandsAsWords(Integer thousands, Integer other, GenderType genderType) {
        if (other == 0) {
            return format("%s tusind", asWords(thousands, genderType));
        }

        return format("%s tusind %s", asWords(thousands, genderType), asWords(other, genderType));
    }

    private String oneThousandAsWords(Integer other, GenderType genderType) {
        if (other == 0) {
            return "et tusind";
        }

        return format("et tusind %s", asWords(other, genderType));
    }
}
