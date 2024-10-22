package co.edu.uniquindio.parcial2.parcial2.Patrones.AbstracFactory.model;

import co.edu.uniquindio.parcial2.parcial2.Patrones.AbstracFactory.services.ICamiseta;

public class CamisetaActual implements ICamiseta {

    @Override
    public void mostrar() {
        System.out.println("Camiseta actual de la Selección Colombia");
    }
}
