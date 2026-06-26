package pl.allegro.finance.tradukisto.internal.languages.finnish

import pl.allegro.finance.tradukisto.internal.languages.AbstractLongValuesTest

import static pl.allegro.finance.tradukisto.internal.Container.finnishContainer

class FinnishLongValuesTest extends AbstractLongValuesTest {

    def setup() {
        longConverter = finnishContainer().getLongConverter()
    }

    @Override
    LongValuesTestData getTestData() {
        testData = new LongValuesTestData(longTranslations)
    }

    private static longTranslations = [
            5_000_000_000             : "viisi miljardia",

            1_000_000_000_000         : "biljoona",
            2_000_000_000_000         : "kaksi biljoonaa",
            5_000_000_000_000         : "viisi biljoonaa",

            1_000_000_000_000_000     : "biljardi",
            2_000_000_000_000_000     : "kaksi biljardia",
            5_000_000_000_000_000     : "viisi biljardia",

            1_000_000_000_000_000_000 : "triljoona",
            2_000_000_000_000_000_000 : "kaksi triljoonaa",
            (Long.MAX_VALUE)          : "yhdeksän triljoonaa kaksisataakaksikymmentäkolme biljardia " +
                    "kolmesataaseitsemänkymmentäkaksi biljoonaa kolmekymmentäkuusi miljardia " +
                    "kahdeksansataaviisikymmentäneljä miljoonaa seitsemänsataaseitsemänkymmentäviisituhatta " +
                    "kahdeksansataaseitsemän"
    ]
}
