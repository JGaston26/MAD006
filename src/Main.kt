fun main() {
    val pikachu = Pokemon(name = "Pikachu", type = "Electric")

    println("Pokemon Name: ${pikachu.name}")
    println("Pokemon Type: ${pikachu.type}")
    println("Pokemon ID: ${pikachu.id}")
    println("Pokemon Description: ${pikachu.description}")

    pikachu.currentHealth = 90
    println("Pokemon Health: ${pikachu.currentHealth}")

    println("Pokemon Summary: ${pikachu.getPokemonSummary()}")

    pikachu.celebrate()
}