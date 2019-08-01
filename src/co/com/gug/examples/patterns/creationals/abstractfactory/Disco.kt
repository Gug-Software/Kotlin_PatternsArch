package co.com.gug.examples.patterns.creationals.abstractfactory

abstract class Disco {

    abstract fun getCapacidad(): String
    abstract fun getNombre(): String
    abstract fun getPrecio(): String

    override fun toString(): String {
        return "${getNombre()} (${getCapacidad()})"
    }

}