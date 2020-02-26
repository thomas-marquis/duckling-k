package fr.tmarquis.ducklingk.dimensions

import fr.tmarquis.ducklingk.models.Rule

abstract class Dimension {
    open fun getRulesFromLang(langCode: String): List<Rule> = emptyList()
}