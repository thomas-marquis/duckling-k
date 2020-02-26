package fr.tmarquis.ducklingk.services

import fr.tmarquis.ducklingk.dimensions.Dimension
import fr.tmarquis.ducklingk.models.Context
import fr.tmarquis.ducklingk.models.Options
import fr.tmarquis.ducklingk.models.RequestContent
import org.springframework.stereotype.Service
import java.util.*

@Service
class ParserService(
        val dimensionsService: DimensionsService
) {

    fun parse(requestContent: RequestContent): String {
        val options = Options(requestContent.latent)
        val context = Context(
                referenceTime = Calendar.getInstance(
                        TimeZone.getTimeZone(requestContent.timeZone)).time,
                locale = Locale.forLanguageTag(requestContent.locale))
        val dimension: Dimension = dimensionsService
                .getFromName(requestContent.dimensionName)
                .orElseThrow()
        return "foo"
    }
}