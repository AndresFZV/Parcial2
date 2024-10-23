package co.edu.uniquindio.parcial2.parcial2.utils;

import co.edu.uniquindio.parcial2.parcial2.model.*;

import java.time.LocalDate;
import java.util.Date;

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

        Empleado empleado3 = Empleado.builder()
                .nombre("Laura")
                .apellido("Gonzalez")
                .cedula("1092")
                .edad(30)
                .build();

        Empleado empleado4 = Empleado.builder()
                .nombre("María")
                .apellido("López")
                .cedula("1093")
                .edad(25)
                .build();

        prestamoObjeto.getListaEmpleados().add(empleado1);
        prestamoObjeto.getListaEmpleados().add(empleado2);
        prestamoObjeto.getListaEmpleados().add(empleado3);
        prestamoObjeto.getListaEmpleados().add(empleado4);

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

        Cliente cliente4 = Cliente.builder()
                .cedula("1097")
                .nombre("Luisa")
                .apellido("Fernandez")
                .direccion("Salento")
                .edad(22)
                .email("luisaf@gmail.com")
                .build();

        Cliente cliente5 = Cliente.builder()
                .cedula("1098")
                .nombre("Miguel")
                .apellido("Alvarez")
                .direccion("Pereira")
                .edad(40)
                .email("miguela@gmail.com")
                .build();

        prestamoObjeto.getListaClientes().add(cliente1);
        prestamoObjeto.getListaClientes().add(cliente2);
        prestamoObjeto.getListaClientes().add(cliente3);
        prestamoObjeto.getListaClientes().add(cliente4);
        prestamoObjeto.getListaClientes().add(cliente5);

        // Objetos
        Objeto objeto1 = Objeto.builder()
                .idObjeto("1234")
                .nombre("Bicicleta")
                .estado("Prestado")
                .vecesPrestado(5)
                .build();

        Objeto objeto2 = Objeto.builder()
                .idObjeto("1235")
                .nombre("Laptop")
                .estado("Disponible")
                .vecesPrestado(3)
                .build();

        Objeto objeto3 = Objeto.builder()
                .idObjeto("1236")
                .nombre("Proyector")
                .estado("Prestado")
                .vecesPrestado(8)
                .build();

        Objeto objeto4 = Objeto.builder()
                .idObjeto("1237")
                .nombre("Libro")
                .estado("Disponible")
                .vecesPrestado(1)
                .build();

        Objeto objeto5 = Objeto.builder()
                .idObjeto("1238")
                .nombre("Cámara")
                .estado("Prestado")
                .vecesPrestado(4)
                .build();

        Objeto objeto6 = Objeto.builder()
                .idObjeto("1239")
                .nombre("Impresora")
                .estado("Disponible")
                .vecesPrestado(2)
                .build();

        Objeto objeto7 = Objeto.builder()
                .idObjeto("1240")
                .nombre("Televisor")
                .estado("Disponible")
                .vecesPrestado(0)
                .build();

        Objeto objeto8 = Objeto.builder()
                .idObjeto("1241")
                .nombre("Móvil")
                .estado("Prestado")
                .vecesPrestado(6)
                .build();

        prestamoObjeto.getListaObjetos().add(objeto1);
        prestamoObjeto.getListaObjetos().add(objeto2);
        prestamoObjeto.getListaObjetos().add(objeto3);
        prestamoObjeto.getListaObjetos().add(objeto4);
        prestamoObjeto.getListaObjetos().add(objeto5);
        prestamoObjeto.getListaObjetos().add(objeto6);
        prestamoObjeto.getListaObjetos().add(objeto7);
        prestamoObjeto.getListaObjetos().add(objeto8);

        // Prestamos
        Prestamo prestamo1 = new Prestamo();
        prestamo1.setNumeroPrestamo("0001");
        prestamo1.setDescripcion("Préstamo de bicicleta");
        prestamo1.setFechaPrestamo(LocalDate.of(2024, 10, 1));
        prestamo1.setFechaEntrega(LocalDate.of(2024, 10, 3));
        prestamo1.setEmpleadoAsociado(empleado1);
        prestamo1.setClienteAsociado(cliente1);
        prestamo1.getListaObjetosAsociados().add(objeto1);

        Prestamo prestamo2 = new Prestamo();
        prestamo2.setNumeroPrestamo("0002");
        prestamo2.setDescripcion("Préstamo de laptop");
        prestamo2.setFechaPrestamo(LocalDate.of(2024, 11, 5));
        prestamo2.setFechaEntrega(LocalDate.of(2024, 11, 10));
        prestamo2.setEmpleadoAsociado(empleado2);
        prestamo2.setClienteAsociado(cliente2);
        prestamo2.getListaObjetosAsociados().add(objeto2);

        Prestamo prestamo3 = new Prestamo();
        prestamo3.setNumeroPrestamo("0003");
        prestamo3.setDescripcion("Préstamo de proyector");
        prestamo3.setFechaPrestamo(LocalDate.of(2024, 12, 12));
        prestamo3.setFechaEntrega(LocalDate.of(2024, 12, 15));
        prestamo3.setEmpleadoAsociado(empleado1);
        prestamo3.setClienteAsociado(cliente3);
        prestamo3.getListaObjetosAsociados().add(objeto3);

        Prestamo prestamo4 = new Prestamo();
        prestamo4.setNumeroPrestamo("0004");
        prestamo4.setDescripcion("Préstamo de cámara");
        prestamo4.setFechaPrestamo(LocalDate.of(2025, 1, 20));
        prestamo4.setFechaEntrega(LocalDate.of(2025, 1, 25));
        prestamo4.setEmpleadoAsociado(empleado3);
        prestamo4.setClienteAsociado(cliente4);
        prestamo4.getListaObjetosAsociados().add(objeto5);

        Prestamo prestamo5 = new Prestamo();
        prestamo5.setNumeroPrestamo("0005");
        prestamo5.setDescripcion("Préstamo de impresora");
        prestamo5.setFechaPrestamo(LocalDate.of(2025, 2, 5));
        prestamo5.setFechaEntrega(LocalDate.of(2025, 2, 10));
        prestamo5.setEmpleadoAsociado(empleado4);
        prestamo5.setClienteAsociado(cliente5);
        prestamo5.getListaObjetosAsociados().add(objeto6);

        Prestamo prestamo6 = new Prestamo();
        prestamo6.setNumeroPrestamo("0006");
        prestamo6.setDescripcion("Préstamo de televisor");
        prestamo6.setFechaPrestamo(LocalDate.of(2025, 3, 15));
        prestamo6.setFechaEntrega(LocalDate.of(2025, 3, 20));
        prestamo6.setEmpleadoAsociado(empleado3);
        prestamo6.setClienteAsociado(cliente2);
        prestamo6.getListaObjetosAsociados().add(objeto7);

        prestamoObjeto.getListaPrestamos().add(prestamo1);
        prestamoObjeto.getListaPrestamos().add(prestamo2);
        prestamoObjeto.getListaPrestamos().add(prestamo3);
        prestamoObjeto.getListaPrestamos().add(prestamo4);
        prestamoObjeto.getListaPrestamos().add(prestamo5);
        prestamoObjeto.getListaPrestamos().add(prestamo6);

        return prestamoObjeto;
    }
}
