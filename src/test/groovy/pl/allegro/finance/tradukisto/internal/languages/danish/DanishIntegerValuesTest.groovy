package pl.allegro.finance.tradukisto.internal.languages.danish

import pl.allegro.finance.tradukisto.internal.languages.AbstractIntegerValuesTest

import static pl.allegro.finance.tradukisto.internal.Container.danishContainer

class DanishIntegerValuesTest extends AbstractIntegerValuesTest {

    def setup() {
        intConverter = danishContainer().getIntegerConverter()
    }

    @Override
    IntegerValuesTestData getTestData() {
        testData = new IntegerValuesTestData(integerTranslations)
    }

    private static integerTranslationsTemp = [
            1_000_000    : "en million"
    ]
    private static integerTranslations = [
//            0            : "nul",
//            1            : "et",
//            2            : "to",
//            3            : "tre",
//            4            : "fire",
//            5            : "fem",
//            6            : "seks",
//            7            : "syv",
//            8            : "otte",
//            9            : "ni",
//            11           : "elleve",
//            12           : "tolv",
//            13           : "tretten",
//            14           : "fjorten",
//            15           : "femten",
//            16           : "seksten",
//            17           : "sytten",
//            18           : "atten",
//            19           : "nitten",
//            10           : "ti",
//            20           : "tyve",
//            30           : "tredive",
//            40           : "fyrre",
//            50           : "halvtreds",
//            60           : "tres",
//            70           : "halvfjerds",
//            80           : "firs",
//            90           : "halvfems",
//            21           : "enogtyve",
//            37           : "syvogtredive",
//            43           : "treogfyrre",
//            58           : "otteoghalvtreds",
//            69           : "niogtres",
//            76           : "seksoghalvfjerds",
//            82           : "toogfirs",
//            95           : "femoghalvfems",
//            100          : "et hundrede",
//            200          : "to hundrede",
//            300          : "tre hundrede",
//            400          : "fire hundrede",
//            500          : "fem hundrede",
//            600          : "seks hundrede",
//            700          : "syv hundrede",
//            800          : "otte hundrede",
//            900          : "ni hundrede",
            111          : "et hundrede elleve",
//            272          : "to hundrede tooghalvfjerds",
//            387          : "tre hundrede syvogfirs",
//            448          : "fire hundrede otteogfyrre",
//            569          : "fem hundrede niogtres",
//            625          : "seks hundrede femogtyve",
//            782          : "syv hundrede toogfirs",
//            895          : "otte hundrede femoghalvfems",
//            999          : "ni hundrede nioghalvfems",
//            1_000        : "et tusind",
//            2_000        : "to tusind",
//            3_000        : "tre tusind",
//            4_000        : "fire tusind",
//            5_000        : "fem tusind",
//            7_634        : "syv tusind seks hundrede fireogtredive",
//            11_000       : "elleve tusind",
//            15_000       : "femten tusind",
//            21_000       : "enogtyve tusind",
//            24_190       : "fireogtyve tusind hundrede halvfems",
//            653_000      : "seks hundrede treoghalvtreds tusind",
//            123_454      : "hundrede treogtyve tusind fire hundrede fireoghalvtreds",
//            700_000      : "syv hundrede tusind",
//            999_999      : "ni hundrede nioghalvfems tusind ni hundrede nioghalvfems",
//            1_000_000    : "en million",
//            2_000_000    : "to millioner",
//            5_000_000    : "fem millioner",
//            23_437_219   : "treogtyve millioner fire hundrede syvogtredive tusind to hundrede nitten",
//            100_000_000  : "hundrede millioner",
//            123_456_789  : "hundrede treogtyve millioner fire hundrede seksoghalvtreds tusind syv hundrede niogfirs",
//            322_089_890  : "tre hundrede toogtyve millioner niogfirs tusind otte hundrede halvfems",
//            1_000_000_000: "en milliard",
            2_147_483_647: "to milliarder hundrede syvogfyrre millioner fire hundrede treogfirs tusind seks hundrede syvogfyrre"
    ]
}