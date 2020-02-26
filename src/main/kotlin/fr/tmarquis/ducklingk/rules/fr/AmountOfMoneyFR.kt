package fr.tmarquis.ducklingk.rules.fr

import fr.tmarquis.ducklingk.tokens.ProductionToken
import fr.tmarquis.ducklingk.models.Rule
import fr.tmarquis.ducklingk.rules.AbstractRule
import fr.tmarquis.ducklingk.tokens.Token

class AmountOfMoneyFR() : AbstractRule() {
    override val rules: List<Rule>
        get() = listOf()

    private val ruleUnitAmount = Rule(
        name = "<unit> <amount>",
        pattern = listOf(

        )
    )

    private val ruleIntersectAndNumeral = Rule(

    )

    private val rulePrecision = Rule(

    )

    private val ruleCent = Rule(

    )

    private val ruleIntersectXCents = Rule(

    )

    private val ruleIntervalBetweenNumeral = Rule(

    )

    private val ruleIntervalBetween = Rule(

    )

    private val ruleIntervalNumeralDash = Rule(

    )

    private val ruleIntervalDash = Rule(

    )

    private val ruleIntervalMax = Rule(

    )

    ruleIntervalMin

    rulePounds

    ruleIntersectAndXCents

    ruleIntersect

    ruleUnnamedCurrency

    override fun buildToken(): Token {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

private val rule = Rule(
    name = "test",
    pattern = listOf(
            Regex.fromLiteral("dd")
    ),
    prod = ProductionToken(dimension = "AmountOfMoney")
)

val amountOfMoneyFR = listOf(rule)