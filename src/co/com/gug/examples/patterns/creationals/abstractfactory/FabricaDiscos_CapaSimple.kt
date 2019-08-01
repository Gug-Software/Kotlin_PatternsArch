package co.com.gug.examples.patterns.creationals.abstractfactory

class FabricaDiscos_CapaSimple : FabricaDiscos {

    override fun crearBluRay(): BluRay {
        return BluRayCapaSimple()
    }

    override fun crearDvd(): Dvd {
        return DvdCapaSimple()
    }

}