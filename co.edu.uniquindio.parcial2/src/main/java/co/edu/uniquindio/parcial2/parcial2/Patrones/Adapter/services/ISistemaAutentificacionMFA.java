package co.edu.uniquindio.parcial2.parcial2.Patrones.Adapter.services;

public interface ISistemaAutentificacionMFA {
    void oneTimePassword(String unicaContraseña);
    void autentificarHuella(String huella);
    void autenticarDispositivo(String dispositivo);

}
