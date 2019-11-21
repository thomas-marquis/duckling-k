package fr.tmarquis.ducklingk.services

import fr.tmarquis.ducklingk.dimensions.*
import org.springframework.stereotype.Service
import java.util.*

@Service
class DimensionsService(
        amountOfMoney: AmountOfMoney,
        distance: Distance,
        duration: Duration,
        email: Email,
        numeral: Numeral,
        ordinal: Ordinal,
        phoneNumber: PhoneNumber,
        quantity: Quantity,
        temperature: Temperature,
        time: Time,
        url: Url,
        volume: Volume
) {
    val dimensionMap: Map<String, Dimension> = hashMapOf(
            "amount-of-money" to amountOfMoney,
            "distance" to distance,
            "duration" to duration,
            "email" to email,
            "number" to numeral,
            "ordinal" to ordinal,
            "phone-number" to phoneNumber,
            "quantity" to quantity,
            "temperature" to temperature,
            "time" to time,
            "url" to url,
            "volume" to volume
    )

    fun getFromName(dimName: String): Optional<Dimension> =
        Optional.ofNullable(dimensionMap[dimName])
}