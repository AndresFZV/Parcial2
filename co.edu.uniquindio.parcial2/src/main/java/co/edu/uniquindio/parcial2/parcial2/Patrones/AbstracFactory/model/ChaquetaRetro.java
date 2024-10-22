package co.edu.uniquindio.parcial2.parcial2.Patrones.AbstracFactory.model;


import co.edu.uniquindio.parcial2.parcial2.Patrones.AbstracFactory.services.IChaqueta;

public class ChaquetaRetro implements IChaqueta {
    @Override
    public void mostrar() {
        System.out.println("Chaqueta retro de la Selección Colombia (Italia 90)");
    }
}
