package pl.allegro.finance.tradukisto.internal.languages.norwegian

import pl.allegro.finance.tradukisto.internal.languages.AbstractIntegerValuesTest

import static pl.allegro.finance.tradukisto.internal.Container.norwegianContainer

class NorwegianIntegerValuesTest extends AbstractIntegerValuesTest {

    def setup() {
        intConverter = norwegianContainer().getIntegerConverter()
    }

    @Override
    IntegerValuesTestData getTestData() {
        testData = new IntegerValuesTestData(integerTranslations)
    }

    private static integerTranslations = [
            0            : "null",
            1            : "en",
            2            : "to",
            3            : "tre",
            4            : "fire",
            5            : "fem",
            6            : "seks",
            7            : "sju",
            8            : "\u00e5tte",
            9            : "ni",
            11           : "elleve",
            12           : "tolv",
            13           : "tretten",
            14           : "fjorten",
            15           : "femten",
            16           : "seksten",
            17           : "sytten",
            18           : "atten",
            19           : "nitten",
            10           : "ti",
            20           : "tjue",
            30           : "tretti",
            40           : "f\u00f8rti",
            50           : "femti",
            60           : "seksti",
            70           : "sytti",
            80           : "\u00e5tti",
            90           : "nitti",
            21           : "tjueen",
            37           : "trettisju",
            43           : "f\u00f8rtitre",
            58           : "femti\u00e5tte",
            69           : "sekstini",
            76           : "syttiseks",
            82           : "\u00e5ttito",
            95           : "nittifem",
            100          : "ett hundre",
            200          : "to hundre",
            300          : "tre hundre",
            400          : "fire hundre",
            500          : "fem hundre",
            600          : "seks hundre",
            700          : "sju hundre",
            800          : "\u00e5tte hundre",
            900          : "ni hundre",
            111          : "ett hundre og elleve",
            272          : "to hundre og syttito",
            387          : "tre hundre og \u00e5ttisju",
            448          : "fire hundre og f\u00f8rti\u00e5tte",
            569          : "fem hundre og sekstini",
            625          : "seks hundre og tjuefem",
            782          : "sju hundre og \u00e5ttito",
            895          : "\u00e5tte hundre og nittifem",
            999          : "ni hundre og nittini",
            1_000        : "ett tusen",
            2_000        : "to tusen",
            3_000        : "tre tusen",
            4_000        : "fire tusen",
            5_000        : "fem tusen",
            7_634        : "sju tusen seks hundre og trettifire",
            11_000       : "elleve tusen",
            15_000       : "femten tusen",
            21_000       : "tjueen tusen",
            24_190       : "tjuefire tusen ett hundre og nitti",
            653_000      : "seks hundre og femtitre tusen",
            123_454      : "ett hundre og tjuetre tusen fire hundre og femtifire",
            700_000      : "sju hundre tusen",
            999_999      : "ni hundre og nittini tusen ni hundre og nittini",
            1_000_000    : "en million",
            2_000_000    : "to millioner",
            5_000_000    : "fem millioner",
            23_437_219   : "tjuetre millioner fire hundre og trettisju tusen to hundre og nitten",
            100_000_000  : "ett hundre millioner",
            123_456_789  : "ett hundre og tjuetre millioner fire hundre og femtiseks tusen sju hundre og \u00e5ttini",
            322_089_890  : "tre hundre og tjueto millioner \u00e5ttini tusen \u00e5tte hundre og nitti",
            1_000_000_000: "en milliard",
            2_147_483_647: "to milliarder ett hundre og f\u00f8rtisju millioner fire hundre og \u00e5ttitre tusen seks hundre og f\u00f8rtisju"
    ]
}
