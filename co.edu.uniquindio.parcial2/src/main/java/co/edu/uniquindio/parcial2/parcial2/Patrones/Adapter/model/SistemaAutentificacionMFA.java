package co.edu.uniquindio.parcial2.parcial2.Patrones.Adapter.model;

import co.edu.uniquindio.parcial2.parcial2.Patrones.Adapter.services.ISistemaAutentificacionMFA;

public class SistemaAutentificacionMFA implements ISistemaAutentificacionMFA {

    @Override
    public void oneTimePassword(String unicaContraseña) {
        System.out.println("Ingresando con unica contraseña:  "+unicaContraseña);
    }
    @Override
    public void autentificarHuella(String huella) {
        System.out.println("Ingresando con huella: "+huella);
    }
    @Override
    public void autenticarDispositivo(String dispositivo) {
        System.out.println("Ingresando con dispositivo: "+dispositivo);

    }
}
