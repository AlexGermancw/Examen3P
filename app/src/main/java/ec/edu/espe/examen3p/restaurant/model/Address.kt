package ec.edu.espe.examen3p.restaurant.model

data class Address(
    val building: String,
    val coord: List<Double>,
    val street: String,
    val zipcode: String
)