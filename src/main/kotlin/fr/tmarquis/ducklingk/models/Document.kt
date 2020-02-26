package fr.tmarquis.ducklingk.models

import java.util.function.Function
import java.util.stream.Collectors
import java.util.stream.IntStream
import javax.print.Doc

data class Document(
        val rowInput: String,
        val utf8Encoded: List<Byte>,
        val indexable: Map<Int, Char>,
        val firstNonAdjacent: Map<Int, Int>,
        val tDropToBSDrop: Map<Int, Int>,
        val bsDropToTDrop: Map<Int, Int>,
        val tDropToUtf16Drop: Map<Int, Int>
) {
    companion object {
        private fun getIndexable(text: String): Map<Int, Char> =
                IntStream
                        .range(0, text.length)
                        .boxed()
                        .collect(Collectors.toMap({i: Int -> i}, { i: Int -> text[i]}))

        private fun isAdjacentSeparator(c: Char) = c == ' ' || c == '\t'

//        private getFirstNonAdjacent(text: String) =
//                null

        @ExperimentalStdlibApi
        fun fromText(text: String): Document =
                Document(
                    rowInput = text,
                    utf8Encoded = text.encodeToByteArray().toList(),
                    indexable = getIndexable(text),
                    firstNonAdjacent =
                )
    }
}
