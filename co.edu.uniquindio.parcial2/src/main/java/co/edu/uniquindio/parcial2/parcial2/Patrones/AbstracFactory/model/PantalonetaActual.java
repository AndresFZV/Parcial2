package co.edu.uniquindio.parcial2.parcial2.Patrones.AbstracFactory.model;


import co.edu.uniquindio.parcial2.parcial2.Patrones.AbstracFactory.services.IPantaloneta;

public class PantalonetaActual implements IPantaloneta {
    @Override
    public void mostrar() {
        System.out.println("Pantaloneta actual de la Selección Colombia");
    }
}
