package fr.tmarquis.ducklingk.services

import fr.tmarquis.ducklingk.dimensions.Dimension
import fr.tmarquis.ducklingk.models.RequestContent
import org.springframework.stereotype.Service

@Service
class ParserService(
        val dimensionsService: DimensionsService
) {

    fun parse(requestContent: RequestContent): String {
        val dimension: Dimension = dimensionsService
                .getFromName(requestContent.dimensionName)
                .orElseThrow()
        return "foo"
    }
}