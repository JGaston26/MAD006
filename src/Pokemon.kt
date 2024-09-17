import kotlin.random.Random

 open class Pokemon(
    val name: String,
    var type: String,
    private val baseExperience: Int = 50,
    var level: Int = 1
) {
    val id: Int = genID()

    var baseHealth: Int = 100

    init {
        println("A new Pokémon has been created: $name")
    }
      open fun description(){
         println("$name is a $type type Pokémon.")
     }
     open fun genID(): Int {
         return Random.nextInt(1,1205)
     }

    fun celebrate() {
        println("$name is celebrating its victory!")
    }

    private fun calculatePower(): Int {
        return baseExperience * level
    }

    open fun getPokemonSummary(): String {
        val power = calculatePower()
        return "Name: $name, Type: $type, Level: $level, Health: $baseHealth, Power: $power"
    }
}