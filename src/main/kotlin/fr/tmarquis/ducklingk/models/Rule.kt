package fr.tmarquis.ducklingk.models

data class Rule(
        val name: String,
        val pattern: List<Regex>,
        val prod: Any)