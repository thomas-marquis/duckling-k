package fr.tmarquis.ducklingk.web.models

data class Request(
        val text: String,
        val lang: String,
        val dims: List<String>,
        val tz: String,
        val locale: String,
        val reftime: String,
        val latent: String
)