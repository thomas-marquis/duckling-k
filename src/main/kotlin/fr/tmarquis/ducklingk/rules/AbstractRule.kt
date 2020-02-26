package fr.tmarquis.ducklingk.rules

import fr.tmarquis.ducklingk.models.Rule
import fr.tmarquis.ducklingk.tokens.Token

abstract class AbstractRule {
    abstract val rules: List<Rule>

    abstract fun buildToken(): Token
}