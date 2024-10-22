package co.edu.uniquindio.parcial2.parcial2.Patrones.AbstracFactory.model;


import co.edu.uniquindio.parcial2.parcial2.Patrones.AbstracFactory.services.IChaqueta;

public class ChaquetaActual implements IChaqueta {

    @Override
    public void mostrar() {
        System.out.println("Chaqueta actual de la Selección Colombia");
    }
}
