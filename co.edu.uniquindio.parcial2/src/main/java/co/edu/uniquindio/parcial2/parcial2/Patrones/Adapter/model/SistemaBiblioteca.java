package co.edu.uniquindio.parcial2.parcial2.Patrones.Adapter.model;
import co.edu.uniquindio.parcial2.parcial2.Patrones.Adapter.services.ISistemaBiblioteca;


public class SistemaBiblioteca implements ISistemaBiblioteca {

    @Override
    public void autentificacionAntiguo(String usuario,String contraseña) {
        System.out.println("Ingresando: "+"\n"+"Usuario: "+usuario+"\n"+"Contraseña: "+contraseña);
    }
}
