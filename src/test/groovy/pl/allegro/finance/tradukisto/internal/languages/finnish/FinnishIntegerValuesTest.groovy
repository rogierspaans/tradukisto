package pl.allegro.finance.tradukisto.internal.languages.finnish

import pl.allegro.finance.tradukisto.internal.languages.AbstractIntegerValuesTest

import static pl.allegro.finance.tradukisto.internal.Container.finnishContainer

class FinnishIntegerValuesTest extends AbstractIntegerValuesTest {

    def setup() {
        intConverter = finnishContainer().getIntegerConverter()
    }

    @Override
    IntegerValuesTestData getTestData() {
        testData = new IntegerValuesTestData(integerTranslations)
    }

    private static integerTranslations = [
            0            : "nolla",
            1            : "yksi",
            2            : "kaksi",
            3            : "kolme",
            4            : "neljä",
            5            : "viisi",
            6            : "kuusi",
            7            : "seitsemän",
            8            : "kahdeksan",
            9            : "yhdeksän",
            11           : "yksitoista",
            12           : "kaksitoista",
            13           : "kolmetoista",
            14           : "neljätoista",
            15           : "viisitoista",
            16           : "kuusitoista",
            17           : "seitsemäntoista",
            18           : "kahdeksantoista",
            19           : "yhdeksäntoista",
            10           : "kymmenen",
            20           : "kaksikymmentä",
            30           : "kolmekymmentä",
            40           : "neljäkymmentä",
            50           : "viisikymmentä",
            60           : "kuusikymmentä",
            70           : "seitsemänkymmentä",
            80           : "kahdeksankymmentä",
            90           : "yhdeksänkymmentä",
            21           : "kaksikymmentäyksi",
            37           : "kolmekymmentäseitsemän",
            43           : "neljäkymmentäkolme",
            58           : "viisikymmentäkahdeksan",
            69           : "kuusikymmentäyhdeksän",
            76           : "seitsemänkymmentäkuusi",
            82           : "kahdeksankymmentäkaksi",
            95           : "yhdeksänkymmentäviisi",
            100          : "sata",
            200          : "kaksisataa",
            300          : "kolmesataa",
            400          : "neljäsataa",
            500          : "viisisataa",
            600          : "kuusisataa",
            700          : "seitsemänsataa",
            800          : "kahdeksansataa",
            900          : "yhdeksänsataa",
            111          : "satayksitoista",
            272          : "kaksisataaseitsemänkymmentäkaksi",
            387          : "kolmesataakahdeksankymmentäseitsemän",
            448          : "neljäsataaneljäkymmentäkahdeksan",
            569          : "viisisataakuusikymmentäyhdeksän",
            625          : "kuusisataakaksikymmentäviisi",
            782          : "seitsemänsataakahdeksankymmentäkaksi",
            895          : "kahdeksansataayhdeksänkymmentäviisi",
            999          : "yhdeksänsataayhdeksänkymmentäyhdeksän",
            1_000        : "tuhat",
            2_000        : "kaksituhatta",
            3_000        : "kolmetuhatta",
            4_000        : "neljätuhatta",
            5_000        : "viisituhatta",
            7_634        : "seitsemäntuhattakuusisataakolmekymmentäneljä",
            11_000       : "yksitoistatuhatta",
            15_000       : "viisitoistatuhatta",
            21_000       : "kaksikymmentäyksituhatta",
            24_190       : "kaksikymmentäneljätuhattasatayhdeksänkymmentä",
            653_000      : "kuusisataaviisikymmentäkolmetuhatta",
            123_454      : "satakaksikymmentäkolmetuhattaneljäsataaviisikymmentäneljä",
            700_000      : "seitsemänsataatuhatta",
            999_999      : "yhdeksänsataayhdeksänkymmentäyhdeksäntuhattayhdeksänsataayhdeksänkymmentäyhdeksän",
            1_000_000    : "miljoona",
            2_000_000    : "kaksi miljoonaa",
            5_000_000    : "viisi miljoonaa",
            23_437_219   : "kaksikymmentäkolme miljoonaa neljäsataakolmekymmentäseitsemäntuhatta kaksisataayhdeksäntoista",
            100_000_000  : "sata miljoonaa",
            123_456_789  : "satakaksikymmentäkolme miljoonaa neljäsataaviisikymmentäkuusituhatta seitsemänsataakahdeksankymmentäyhdeksän",
            322_089_890  : "kolmesataakaksikymmentäkaksi miljoonaa kahdeksankymmentäyhdeksäntuhatta kahdeksansataayhdeksänkymmentä",
            1_000_000_000: "miljardi",
            2_147_483_647: "kaksi miljardia sataneljäkymmentäseitsemän miljoonaa neljäsataakahdeksankymmentäkolmetuhatta kuusisataaneljäkymmentäseitsemän"
    ]
}
