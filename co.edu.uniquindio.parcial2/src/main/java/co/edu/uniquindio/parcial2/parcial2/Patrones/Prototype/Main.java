package co.edu.uniquindio.parcial2.parcial2.Patrones.Prototype;

    public class Main {
        public static void main(String[] args) {
            // Crear prototipos
            Coche cocheOriginal = new Coche("Toyota", "Corolla","Negro", 4);
            Motocicleta motoOriginal = new Motocicleta("Harley-Davidson", "Sportster","Verda ");

            // Clonar los objetos
            Coche cocheClon = (Coche) cocheOriginal.clone();
            cocheClon.setModelo("Willis");
            Motocicleta motoClon = (Motocicleta) motoOriginal.clone();
            motoClon.setColor("Amarillo");

            // Mostrar información de los vehículos originales y clonados
            System.out.println("Originales:");
            cocheOriginal.mostrarInfo();
            motoOriginal.mostrarInfo();

            System.out.println("\nClones:");
            cocheClon.mostrarInfo();
            motoClon.mostrarInfo();
        }
}
