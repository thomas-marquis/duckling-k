package fr.tmarquis.ducklingk.models

data class Node(
        val range: Range,
        val token: String,
        val children: List<Node>,
        val rule: Rule
)