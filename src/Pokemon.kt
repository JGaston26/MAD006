import kotlin.random.Random

class Pokemon(
    val name: String,
    var type: String,
    private val baseExperience: Int = 50,
    var level: Int = 1
) {
    val id: Int = Random.nextInt(1,1025)

    private var secretPower: String? = null

    var currentHealth: Int = 100

    val description: String
        get() = "$name is a $type type Pokémon."

    init {
        println("A new Pokémon has been created: $name")
    }

    fun celebrate() {
        println("$name is celebrating its victory!")
    }

    private fun calculatePower(): Int {
        return baseExperience * level
    }

    fun getPokemonSummary(): String {
        val power = calculatePower()
        return "Name: $name, Type: $type, Level: $level, Health: $currentHealth, Power: $power"
    }
}