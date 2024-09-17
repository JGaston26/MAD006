fun main() {

        val digimon = Digimon(name = "Agumon", attribute = "Fire", canFuse = true)

        println("Testing fuseInfo:")
        digimon.fuseInfo()

        println("\nTesting increaseHealth:")
        println("Initial Health: ${digimon.newHealth}")
        digimon.increaseHealth()
        println("New Health after increase: ${digimon.newHealth}")

        println("\nTesting doEvo:")
        digimon.newHealth = digimon.baseHealth + 51
        println("Stage before evolution: ${digimon.stage}")
        digimon.doEvo()
        println("Stage after evolution attempt: ${digimon.stage}")

        println("\nTesting toString:")
        println(digimon.toString())

        println("\nTesting description:")
        digimon.description()

        println("\nTesting getPokemonSummary:")
        println(digimon.getPokemonSummary())
    }