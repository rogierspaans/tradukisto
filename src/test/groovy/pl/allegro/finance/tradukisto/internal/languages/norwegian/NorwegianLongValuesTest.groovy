package pl.allegro.finance.tradukisto.internal.languages.norwegian

import pl.allegro.finance.tradukisto.internal.languages.AbstractLongValuesTest

import static pl.allegro.finance.tradukisto.internal.Container.norwegianContainer

class NorwegianLongValuesTest extends AbstractLongValuesTest {

    def setup() {
        longConverter = norwegianContainer().getLongConverter()
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
            (Long.MAX_VALUE)          : "ni trillioner to hundre og tjuetre billiarder " +
                    "tre hundre og syttito billioner trettiseks milliarder " +
                    "\u00e5tte hundre og femtifire millioner sju hundre og syttifem tusen " +
                    "\u00e5tte hundre og sju"
    ]
}
