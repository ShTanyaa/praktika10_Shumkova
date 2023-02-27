class Asus (override var name:String,override var frequency:Int,override var RAM:Double,private var HDD:Double):Interfacee{

    override fun Q(): Double {
        return super.Q()+0.5*HDD
    }
    override  fun info():String{
        return "название процессора - $name "+
                "тактовая частота процессора - $frequency "+
                "объем оперативной памяти - $RAM "+
                "качество ${Q()} "
    }
}