package co.com.gug.examples.patterns.creationals.abstractfactory

class DvdCapaSimple : Dvd() {

    override fun getCapacidad(): String {
        return "4.7Gb"
    }

    override fun getNombre(): String {
        return "DVD capa simple"
    }

    override fun getPrecio(): String {
        return "$5.00"
    }

}