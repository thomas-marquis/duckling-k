package fr.tmarquis.ducklingk.models

import java.util.*

enum class Lang(val code: String, val fullName: String) {
    INVALID_LANG("invalid_lang", "non valide lang code"),
    FR("fr", "français"),
    EN("en", "english");

    companion object {
        fun getFromCode(code: String): Lang =
                Optional.ofNullable(values().firstOrNull { it.code == code })
                        .orElse(INVALID_LANG)
    }
}