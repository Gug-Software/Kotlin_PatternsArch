package co.com.gug.examples.patterns.creationals.abstractfactory

fun main(args: Array<String>) {
    println("Hello from Abstract Factory")

    var fabricadiscosCapasimple = FabricaDiscos_CapaSimple()
    var dvd = fabricadiscosCapasimple.crearDvd()
    var bluRay = fabricadiscosCapasimple.crearBluRay()

    println(dvd.toString())
    println(bluRay.toString())

}
