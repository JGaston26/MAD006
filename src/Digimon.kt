import kotlin.random.Random

class Digimon(name: String,
              val attribute: String,
              private val baseExperience: Int = 50,
              var stage: Int = 0,
              val canFuse: Boolean
    ) : Pokemon(name,attribute,baseExperience,stage) {
    init {
        println("A new Digimon has been created: $name")
    }
    var newHealth = 0
    fun fuseInfo (){
        if(genID() > 700){
            println("This Digimon will be able to fuse by its final stage")
        }
        println("This Digimon will not be able to fuse at any stage")
    }
    fun increaseHealth(): Int{
        newHealth = super.baseHealth +25;
        return newHealth
    }
    fun doEvo(){
        if(newHealth > baseHealth+50){
            println("Can Evolve")
            stage.inc()
        }
        println("Can't Evolve")
    }
    override fun toString(): String {
        return "Digimon: $name of stage: $stage"
    }
    override fun description(){
        println("This Digimon is the mighty $name! ")
    }
    override fun genID(): Int{
        return Random.nextInt(1502)
    }
    override fun getPokemonSummary(): String {
        return "This Digimon is called $name of the $attribute! " +
                "This Digimon is at stage $stage and fusing is $canFuse"
    }
}