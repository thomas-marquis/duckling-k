package fr.tmarquis.ducklingk

import kotlin.streams.toList


@ExperimentalStdlibApi
fun main() {
    val text = "abcd"
    val l: List<Int> = text.chars().toList()
    val b: List<Byte> = text.encodeToByteArray().asList()

    print("END")
}