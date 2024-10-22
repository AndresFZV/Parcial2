package co.edu.uniquindio.parcial2.parcial2.Patrones.AbstracFactory.factory;

import co.edu.uniquindio.parcial2.parcial2.Patrones.AbstracFactory.model.CamisetaRetro;
import co.edu.uniquindio.parcial2.parcial2.Patrones.AbstracFactory.model.ChaquetaRetro;
import co.edu.uniquindio.parcial2.parcial2.Patrones.AbstracFactory.model.PantalonetaRetro;
import co.edu.uniquindio.parcial2.parcial2.Patrones.AbstracFactory.services.IAdidasFactory;
import co.edu.uniquindio.parcial2.parcial2.Patrones.AbstracFactory.services.ICamiseta;
import co.edu.uniquindio.parcial2.parcial2.Patrones.AbstracFactory.services.IChaqueta;
import co.edu.uniquindio.parcial2.parcial2.Patrones.AbstracFactory.services.IPantaloneta;

public class ColeccionRetroFactory implements IAdidasFactory {

    @Override
    public IChaqueta crearChaqueta() {
        return new ChaquetaRetro();
    }

    @Override
    public ICamiseta crearCamiseta() {
        return new CamisetaRetro();
    }

    @Override
    public IPantaloneta crearPantaloneta() {
        return new PantalonetaRetro();
    }
}
