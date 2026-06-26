package pl.allegro.finance.tradukisto.internal.languages.norwegian;

import static pl.allegro.finance.tradukisto.internal.languages.GenderForms.genderForms;
import static pl.allegro.finance.tradukisto.internal.support.BaseNumbersBuilder.baseNumbersBuilder;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import pl.allegro.finance.tradukisto.internal.languages.GenderForms;
import pl.allegro.finance.tradukisto.internal.languages.GenderType;
import pl.allegro.finance.tradukisto.internal.languages.PluralForms;
import pl.allegro.finance.tradukisto.internal.languages.RegularPluralForms;

public class NorwegianValues {

    public Map<Integer, GenderForms> baseNumbers() {
        return baseNumbersBuilder()
            .put(0, "null")
            .put(1, genderForms("en", "en", "ett", "en"))
            .put(2, "to")
            .put(3, "tre")
            .put(4, "fire")
            .put(5, "fem")
            .put(6, "seks")
            .put(7, "sju")
            .put(8, "åtte")
            .put(9, "ni")
            .put(10, "ti")
            .put(11, "elleve")
            .put(12, "tolv")
            .put(13, "tretten")
            .put(14, "fjorten")
            .put(15, "femten")
            .put(16, "seksten")
            .put(17, "sytten")
            .put(18, "atten")
            .put(19, "nitten")
            .put(20, "tjue")
            .put(30, "tretti")
            .put(40, "førti")
            .put(50, "femti")
            .put(60, "seksti")
            .put(70, "sytti")
            .put(80, "åtti")
            .put(90, "nitti")
            .put(100, "ett hundre")
            .put(200, "to hundre")
            .put(300, "tre hundre")
            .put(400, "fire hundre")
            .put(500, "fem hundre")
            .put(600, "seks hundre")
            .put(700, "sju hundre")
            .put(800, "åtte hundre")
            .put(900, "ni hundre")
            .build();
    }

    public List<PluralForms> pluralForms() {
        return Arrays.asList(
            new RegularPluralForms("", "", GenderType.NON_APPLICABLE),
            new RegularPluralForms("tusen", "tusen", GenderType.NEUTER),
            new RegularPluralForms("million", "millioner", GenderType.MASCULINE),
            new RegularPluralForms("milliard", "milliarder", GenderType.MASCULINE),
            new RegularPluralForms("billion", "billioner", GenderType.MASCULINE),
            new RegularPluralForms("billiard", "billiarder", GenderType.MASCULINE),
            new RegularPluralForms("trillion", "trillioner", GenderType.MASCULINE)
        );
    }

    public String currency() {
        return "kr";
    }
}
