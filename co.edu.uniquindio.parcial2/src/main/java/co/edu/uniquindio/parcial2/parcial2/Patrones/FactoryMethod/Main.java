package co.edu.uniquindio.parcial2.parcial2.Patrones.FactoryMethod;

import co.edu.uniquindio.parcial2.parcial2.Patrones.FactoryMethod.factory.BicicletaFactory;
import co.edu.uniquindio.parcial2.parcial2.Patrones.FactoryMethod.factory.LavadoraFactory;
import co.edu.uniquindio.parcial2.parcial2.Patrones.FactoryMethod.model.Electrodomestico;
import co.edu.uniquindio.parcial2.parcial2.Patrones.FactoryMethod.model.Vehiculo;
import co.edu.uniquindio.parcial2.parcial2.Patrones.FactoryMethod.services.IProducto;


public class Main {
    public static void main(String[] args) {

        IProducto coche = new BicicletaFactory();
        Vehiculo cocheFactory = coche.crearProductoVehiculo("Toyota",
                "Carro para uso personal o viajes de negocios");
        System.out.println(cocheFactory);

        IProducto bicicleta = new BicicletaFactory();
        Vehiculo bicicletaFactory = bicicleta.crearProductoVehiculo("Todoterreno",
                "Bicicleta para clientes eco-conscientes o eventos en zonas urbanas");
        System.out.println(bicicletaFactory);

        IProducto motocicleta = new BicicletaFactory();
        Vehiculo motocicletaFactory = motocicleta.crearProductoVehiculo("MRX-150",
                "Motocileta ideal para clientes que buscan un transporte ágil");
        System.out.println(motocicletaFactory);

        IProducto lavadora = new LavadoraFactory();
        Electrodomestico lavadoraFactory = lavadora.crearProductoElectrodomestico("LG-200",
                "Lavadora principalmente para clientes en rentas de vivienda a largo plazo");
        System.out.println(lavadoraFactory);

        IProducto refrigerador = new LavadoraFactory();
        Electrodomestico refrigeradorFactory = refrigerador.crearProductoElectrodomestico("Sony-x10",
                "Nevera para eventos o uso doméstico temporal");
        System.out.println(refrigeradorFactory);

        IProducto televisor = new LavadoraFactory();
        Electrodomestico televisorFactory = televisor.crearProductoElectrodomestico("LG-23",
                "Televisor para ferias, exposiciones o entretenimiento doméstico");
        System.out.println(televisorFactory);
    }
}
