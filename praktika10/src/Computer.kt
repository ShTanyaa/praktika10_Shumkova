abstract class Computer(var name:String,var frequency:Int,var RAM:Double) {
    constructor(name:String,frequency:Int):this(name,frequency,0.0)
    open fun Q():Double{
        return 0.1*frequency+RAM
    }
    open fun info():String{
        return "название процессора - $name "+
                "тактовая частота процессора - ${frequency} МГц"+
                "объем оперативной памяти - ${RAM} Мб"+
                "качество ${Q()} Гб"
    }

}