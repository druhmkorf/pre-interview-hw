package preinterviewhw

class Pet {

    String name
    String type
    Integer age
    Integer numLegs
    Boolean isMammal

    static constraints = {
        name blank: false
        type(inList: ["Dog", "Cat","Rodent","Bird","Arachnid","Snake"])// blank: false
        age nullable: true
        numLegs max: 8
        isMammal blank: false
    }
}
