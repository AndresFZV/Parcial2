package co.edu.uniquindio.parcial2.parcial2.utils;


import co.edu.uniquindio.parcial2.parcial2.model.*;

public class DataUtil {

    public static PrestamoObjeto inicializarDatos() {
        PrestamoObjeto prestamoObjeto = new PrestamoObjeto();
        // Empleados
        Empleado empleado1 = Empleado.builder()
                .nombre("Stiven")
                .apellido("Robles")
                .cedula("1090")
                .edad(32)
                .build();

        Empleado empleado2 = Empleado.builder()
                .nombre("Carlos")
                .apellido("Perez")
                .cedula("1091")
                .edad(28)
                .build();

        prestamoObjeto.getListaEmpleados().add(empleado1);
        prestamoObjeto.getListaEmpleados().add(empleado2);

        // Clientes
        Cliente cliente1 = Cliente.builder()
                .cedula("1094")
                .nombre("Juan")
                .apellido("Arias")
                .direccion("Armenia")
                .edad(17)
                .email("juanarias@gmail.com")
                .build();

        Cliente cliente2 = Cliente.builder()
                .cedula("1095")
                .nombre("Ana")
                .apellido("Cardenas")
                .direccion("Quimbaya")
                .edad(25)
                .email("ana.cardenas@gmail.com")
                .build();

        Cliente cliente3 = Cliente.builder()
                .cedula("1096")
                .nombre("Pedro")
                .apellido("Martinez")
                .direccion("Calarcá")
                .edad(30)
                .email("pedromartinez@gmail.com")
                .build();

        prestamoObjeto.getListaClientes().add(cliente1);
        prestamoObjeto.getListaClientes().add(cliente2);
        prestamoObjeto.getListaClientes().add(cliente3);

        // Objetos
        Objeto objeto1 = Objeto.builder()
                .idObjeto("1234")
                .nombre("Bicicleta")
                .estado("Prestado")
                .vecesPrestado(5)  // Este objeto ha sido prestado 5 veces
                .build();

        Objeto objeto2 = Objeto.builder()
                .idObjeto("1235")
                .nombre("Laptop")
                .estado("Disponible")
                .vecesPrestado(3)  // Este objeto ha sido prestado 3 veces
                .build();

        Objeto objeto3 = Objeto.builder()
                .idObjeto("1236")
                .nombre("Proyector")
                .estado("Prestado")
                .vecesPrestado(8)  // Este objeto ha sido prestado 8 veces
                .build();

        Objeto objeto4 = Objeto.builder()
                .idObjeto("1237")
                .nombre("Libro")
                .estado("Disponible")
                .vecesPrestado(1)  // Este objeto ha sido prestado 1 vez
                .build();

        // Prestamos
        Prestamo prestamo1 = new Prestamo();
        prestamo1.setNumeroPrestamo("0001");
        prestamo1.setDescripcion("Préstamo de bicicleta");
        prestamo1.setEmpleadoAsociado(empleado1);
        prestamo1.setClienteAsociado(cliente1);
        prestamo1.getListaObjetosAsociados().add(objeto1);

        Prestamo prestamo2 = new Prestamo();
        prestamo2.setNumeroPrestamo("0002");
        prestamo2.setDescripcion("Préstamo de laptop");
        prestamo2.setEmpleadoAsociado(empleado2);
        prestamo2.setClienteAsociado(cliente2);
        prestamo2.getListaObjetosAsociados().add(objeto2);

        Prestamo prestamo3 = new Prestamo();
        prestamo3.setNumeroPrestamo("0003");
        prestamo3.setDescripcion("Préstamo de proyector");
        prestamo3.setEmpleadoAsociado(empleado1);
        prestamo3.setClienteAsociado(cliente3);
        prestamo3.getListaObjetosAsociados().add(objeto3);

        // Agregar préstamos a la lista
        prestamoObjeto.getListaPrestamos().add(prestamo1);
        prestamoObjeto.getListaPrestamos().add(prestamo2);
        prestamoObjeto.getListaPrestamos().add(prestamo3);

        return prestamoObjeto;
    }
}