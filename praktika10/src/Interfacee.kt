interface Interfacee {
    var name:String
    var frequency:Int
    var RAM:Double
    fun Q():Double{
        return 0.1*frequency+RAM
    }
    fun info():String
}