package fr.tmarquis.ducklingk.web

import fr.tmarquis.ducklingk.mappers.RequestMapper
import fr.tmarquis.ducklingk.services.ParserService
import fr.tmarquis.ducklingk.web.models.Request
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Controller(
        val requestMapper: RequestMapper,
        val parser: ParserService) {

    @PostMapping("/parse")
    fun parseText(request: Request): String {
        return parser.parse(requestMapper.mapToContent(request))
    }
}