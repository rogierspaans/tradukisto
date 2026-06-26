package pl.allegro.finance.tradukisto.internal.languages.danish

import pl.allegro.finance.tradukisto.internal.languages.AbstractLongValuesTest

import static pl.allegro.finance.tradukisto.internal.Container.danishContainer

class DanishLongValuesTest extends AbstractLongValuesTest {

    def setup() {
        longConverter = danishContainer().getLongConverter()
    }

    @Override
    LongValuesTestData getTestData() {
        testData = new LongValuesTestData(longTranslations)
    }

    private static longTranslations = [
            5_000_000_000             : "fem milliarder",

            1_000_000_000_000         : "en billion",
            2_000_000_000_000         : "to billioner",
            5_000_000_000_000         : "fem billioner",

            1_000_000_000_000_000     : "en billiard",
            2_000_000_000_000_000     : "to billiarder",
            5_000_000_000_000_000     : "fem billiarder",

            1_000_000_000_000_000_000 : "en trillion",
            2_000_000_000_000_000_000 : "to trillioner",
            (Long.MAX_VALUE)          : "ni trillioner to hundrede treogtyve billiarder " +
                    "tre hundrede tooghalvfjerds billioner seksogtredive milliarder " +
                    "otte hundrede fireoghalvtreds millioner syv hundrede femoghalvfjerds tusind " +
                    "otte hundrede syv"
    ]
}
