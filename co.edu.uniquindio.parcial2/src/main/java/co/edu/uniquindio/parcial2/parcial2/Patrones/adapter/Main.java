package co.edu.uniquindio.parcial2.parcial2.Patrones.adapter;

import co.edu.uniquindio.parcial2.parcial2.Patrones.adapter.model.AdaptadorPasarela;
import co.edu.uniquindio.parcial2.parcial2.Patrones.adapter.model.NuevaPasarelaPagos;
import co.edu.uniquindio.parcial2.parcial2.Patrones.adapter.model.PagoHeredado;
import co.edu.uniquindio.parcial2.parcial2.Patrones.adapter.services.SistemaPagoHeredado;

public class Main {
    public static void main(String[] args) {
        // Crear el sistema de pago heredado
        SistemaPagoHeredado sistemaHeredado = new PagoHeredado();
        sistemaHeredado.procesarPago(10000.0);

        // Integrar la nueva pasarela de pagos a través del adaptador
        NuevaPasarelaPagos nuevaPasarela = new NuevaPasarelaPagos();
        SistemaPagoHeredado adaptador = new AdaptadorPasarela(nuevaPasarela);

        // Ahora podemos usar el adaptador para procesar pagos
        adaptador.procesarPago(10000.0);
    }
}
