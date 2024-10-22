package co.edu.uniquindio.parcial2.parcial2.Patrones.AbstracFactory.factory;


import co.edu.uniquindio.parcial2.parcial2.Patrones.AbstracFactory.model.CamisetaMundial;
import co.edu.uniquindio.parcial2.parcial2.Patrones.AbstracFactory.model.ChaquetaMundial;
import co.edu.uniquindio.parcial2.parcial2.Patrones.AbstracFactory.model.PantalonetaMundial;
import co.edu.uniquindio.parcial2.parcial2.Patrones.AbstracFactory.services.IAdidasFactory;
import co.edu.uniquindio.parcial2.parcial2.Patrones.AbstracFactory.services.ICamiseta;
import co.edu.uniquindio.parcial2.parcial2.Patrones.AbstracFactory.services.IChaqueta;
import co.edu.uniquindio.parcial2.parcial2.Patrones.AbstracFactory.services.IPantaloneta;

public class ColeccionMundialFactory implements IAdidasFactory {

    @Override
    public IChaqueta crearChaqueta() {
        return new ChaquetaMundial();
    }

    @Override
    public ICamiseta crearCamiseta() {
        return new CamisetaMundial();
    }

    @Override
    public IPantaloneta crearPantaloneta() {
        return new PantalonetaMundial();
    }
}
