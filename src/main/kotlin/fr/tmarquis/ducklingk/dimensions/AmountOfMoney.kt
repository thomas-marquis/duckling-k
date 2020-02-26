package fr.tmarquis.ducklingk.dimensions

import fr.tmarquis.ducklingk.models.Lang
import fr.tmarquis.ducklingk.models.Rule
import fr.tmarquis.ducklingk.rules.en.amountOfMoneyEN
import fr.tmarquis.ducklingk.rules.fr.amountOfMoneyFR
import org.springframework.stereotype.Service

@Service
class AmountOfMoney : Dimension() {

    private val supportedLang: Map<Lang, List<Rule>> = mapOf(
            Lang.EN to amountOfMoneyEN,
            Lang.FR to amountOfMoneyFR
    )

    override fun getRulesFromLang(langCode: String): List<Rule> {
        val lang = Lang.getFromCode(langCode)
        return if (lang == Lang.INVALID_LANG) {
            emptyList()
        } else {
            supportedLang.getOrDefault(lang, emptyList())
        }
    }
}