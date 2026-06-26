package pl.allegro.finance.tradukisto.internal.languages.finnish;

import static pl.allegro.finance.tradukisto.internal.support.MapSupport.unmodifiableEntry;
import static pl.allegro.finance.tradukisto.internal.support.MapSupport.unmodifiableMapOf;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import pl.allegro.finance.tradukisto.internal.languages.PluralForms;
import pl.allegro.finance.tradukisto.internal.languages.RegularPluralForms;

public class FinnishValues {

    public Map<Integer, String> baseNumbers() {
        return unmodifiableMapOf(
            unmodifiableEntry(0, "nolla"),
            unmodifiableEntry(1, "yksi"),
            unmodifiableEntry(2, "kaksi"),
            unmodifiableEntry(3, "kolme"),
            unmodifiableEntry(4, "neljä"),
            unmodifiableEntry(5, "viisi"),
            unmodifiableEntry(6, "kuusi"),
            unmodifiableEntry(7, "seitsemän"),
            unmodifiableEntry(8, "kahdeksan"),
            unmodifiableEntry(9, "yhdeksän"),
            unmodifiableEntry(10, "kymmenen")
        );
    }

    public List<PluralForms> pluralForms() {
        return Arrays.asList(
            new RegularPluralForms("", ""),
            new RegularPluralForms("tuhat", "tuhatta"),
            new RegularPluralForms("miljoona", "miljoonaa"),
            new RegularPluralForms("miljardi", "miljardia"),
            new RegularPluralForms("biljoona", "biljoonaa"),
            new RegularPluralForms("biljardi", "biljardia"),
            new RegularPluralForms("triljoona", "triljoonaa")
        );
    }

    public String currency() {
        return "€";
    }
}
