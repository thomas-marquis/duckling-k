package fr.tmarquis.ducklingk.models

data class Entity(
        val dim: String,
        val body: String,
        val value: Any, // TODO
        val start: Int,
        val end: Int,
        val latent: Boolean,
        val enode: Node
)