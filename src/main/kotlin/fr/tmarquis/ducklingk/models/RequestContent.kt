package fr.tmarquis.ducklingk.models

data class RequestContent(
    val dimensionName: String,
    val latent: Boolean,
    val timeZone: String,
    val locale: String
)