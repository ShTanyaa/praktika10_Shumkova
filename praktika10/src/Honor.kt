import jdk.jfr.Frequency

class Honor(name:String, frequency:Int,RAM:Double,private var HDD:Double):Computer(name,frequency,RAM) {
    constructor(name:String,RAM:Double,HDD:Double):this(name,10,RAM,HDD)

    override fun Q(): Double {
        return super.Q()+0.5*HDD
    }
    override fun info():String{
        return "название процессора - $name "+
                "тактовая частота процессора - $frequency "+
                "объем оперативной памяти - $RAM "+
                "качество ${Q()} "
    }
}