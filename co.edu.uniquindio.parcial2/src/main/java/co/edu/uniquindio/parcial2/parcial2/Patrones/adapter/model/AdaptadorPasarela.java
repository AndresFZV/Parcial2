package co.edu.uniquindio.parcial2.parcial2.Patrones.adapter.model;

import co.edu.uniquindio.parcial2.parcial2.Patrones.adapter.services.SistemaPagoHeredado;

public class AdaptadorPasarela implements SistemaPagoHeredado {
    private NuevaPasarelaPagos nuevaPasarela;

    public AdaptadorPasarela(NuevaPasarelaPagos nuevaPasarela) {
        this.nuevaPasarela = nuevaPasarela;
    }

    @Override
    public void procesarPago(double monto) {
        nuevaPasarela.realizarPago(monto);
    }
}
