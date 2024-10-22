package co.edu.uniquindio.parcial2.parcial2.Patrones.AbstracFactory.factory;


import co.edu.uniquindio.parcial2.parcial2.Patrones.AbstracFactory.model.CamisetaActual;
import co.edu.uniquindio.parcial2.parcial2.Patrones.AbstracFactory.model.ChaquetaActual;
import co.edu.uniquindio.parcial2.parcial2.Patrones.AbstracFactory.model.PantalonetaActual;
import co.edu.uniquindio.parcial2.parcial2.Patrones.AbstracFactory.services.IAdidasFactory;
import co.edu.uniquindio.parcial2.parcial2.Patrones.AbstracFactory.services.ICamiseta;
import co.edu.uniquindio.parcial2.parcial2.Patrones.AbstracFactory.services.IChaqueta;
import co.edu.uniquindio.parcial2.parcial2.Patrones.AbstracFactory.services.IPantaloneta;

public class ColeccionActualFactory implements IAdidasFactory {

    @Override
    public IChaqueta crearChaqueta() {
        return new ChaquetaActual();
    }

    @Override
    public ICamiseta crearCamiseta() {
        return new CamisetaActual();
    }

    @Override
    public IPantaloneta crearPantaloneta() {
        return new PantalonetaActual();
    }
}
