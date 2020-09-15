interface Virus{
    fun mutate()
    fun spread()
}
enum class VirusType{
    corona,
    influenza,
    HIV

}
class CoronaVirus:Virus{
    override fun mutate() {
        println("Inside  CoronaVirus class ")
    }
    override fun spread() {
        println("CoronaVirus is spreading now widely ")
    }

}
class InfluenzaVirus:Virus{
    override fun mutate() {
        println("Inside InfluenzaVirus class ")
    }
    override fun spread() {
        println("InfluenzaVirus is spreading now widely ")
    }

}
class HIVVirus:Virus{
    override fun mutate() {
        println("Inside HIVVirus class ")
    }
    override fun spread() {
        println("HIVVirus is spreading now widely ")
    }

}
class VirusFactory{


    fun makeVirus(virusType:VirusType):Virus{
        var  type:Virus?
        if(virusType==VirusType.corona)
            type= CoronaVirus()
        else if(virusType==VirusType.influenza)
            type=InfluenzaVirus()
        else type=HIVVirus()
        return type;


    }
}

fun main() {

    var v1=VirusFactory().makeVirus(VirusType.influenza)
    v1.mutate()
    v1.spread()
    var v2=VirusFactory().makeVirus(VirusType.corona)
    v2.mutate()
    v2.spread()
    var v3=VirusFactory().makeVirus(VirusType.HIV)
    v3.mutate()
    v3.spread()

}