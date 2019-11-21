package fr.tmarquis.ducklingk.mappers

import fr.tmarquis.ducklingk.models.RequestContent
import fr.tmarquis.ducklingk.web.models.Request
import org.springframework.stereotype.Service

@Service
class RequestMapper() {

    fun mapToContent(request: Request) : RequestContent {
        return RequestContent()
    }
}