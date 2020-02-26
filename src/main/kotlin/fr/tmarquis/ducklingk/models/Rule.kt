package fr.tmarquis.ducklingk.models

import fr.tmarquis.ducklingk.tokens.ProductionToken

data class Rule(
        val name: String,
        val pattern: List<Regex>,
        val prod: Any = ProductionToken(dimension = ""))