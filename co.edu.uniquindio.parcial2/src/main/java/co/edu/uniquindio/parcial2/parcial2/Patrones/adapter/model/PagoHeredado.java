package co.edu.uniquindio.parcial2.parcial2.Patrones.adapter.model;

import co.edu.uniquindio.parcial2.parcial2.Patrones.adapter.services.SistemaPagoHeredado;

 public class PagoHeredado implements SistemaPagoHeredado {
    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago de: $" + monto + " en el sistema heredado.");
    }
}
