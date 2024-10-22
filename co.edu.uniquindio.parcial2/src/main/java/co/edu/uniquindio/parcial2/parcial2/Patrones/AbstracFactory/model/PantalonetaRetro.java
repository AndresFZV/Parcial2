package co.edu.uniquindio.parcial2.parcial2.Patrones.AbstracFactory.model;


import co.edu.uniquindio.parcial2.parcial2.Patrones.AbstracFactory.services.IPantaloneta;

public class PantalonetaRetro implements IPantaloneta {
    @Override
    public void mostrar() {
        System.out.println("Pantaloneta retro de la Selección Colombia (Italia 90)");
    }
}
