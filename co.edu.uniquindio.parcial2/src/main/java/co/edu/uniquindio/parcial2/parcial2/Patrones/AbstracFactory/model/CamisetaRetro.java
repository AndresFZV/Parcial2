package co.edu.uniquindio.parcial2.parcial2.Patrones.AbstracFactory.model;


import co.edu.uniquindio.parcial2.parcial2.Patrones.AbstracFactory.services.ICamiseta;

public class CamisetaRetro implements ICamiseta {
    @Override
    public void mostrar() {
        System.out.println("Camiseta retro de la Selección Colombia (Italia 90)");
    }
}
