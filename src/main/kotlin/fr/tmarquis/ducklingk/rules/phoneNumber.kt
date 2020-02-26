package fr.tmarquis.ducklingk.rules

import fr.tmarquis.ducklingk.tokens.ProductionToken
import fr.tmarquis.ducklingk.models.Rule

val phoneNumber = listOf(phoneNumberRule)

private val areaCode = "(?:\\(?\\+(\\d{1,2})\\)?[\\s-\\.]*)?"
private val nums = "((?=[-\\d()\\s\\.]{6,16}(?:\\s*e?xt?\\.?\\s*(?:\\d{1,20}))?(?:[^\\d]+|$))(?:[\\d(]{1,20}(?:[-)\\s\\.]*\\d{1,20}){0,20}){1,20})"
private val extension = "(?:\\s*e?xt?\\.?\\s*(\\d{1,20}))?"

private val phoneNumberRule: Rule = Rule(
        name = "phone number",
        pattern = listOf(
            Regex.fromLiteral(areaCode + nums + extension)
        ),
        prod = ProductionToken(dimension = "")
)