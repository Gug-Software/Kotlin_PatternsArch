package co.com.gug.examples.patterns.creationals.abstractfactory

class BluRayCapaSimple : BluRay() {

    override fun getCapacidad(): String {
        return "4.7Gb"
    }

    override fun getNombre(): String {
        return "BluRay capa simple"
    }

    override fun getPrecio(): String {
        return "$5.00"
    }

}