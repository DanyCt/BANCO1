import ec.edu.uce.dominio.Cliente;
import ec.edu.uce.dominio.Cuenta;

public class TestCliente {
    private static Cliente cliente; // Objeto Cliente para realizar las pruebas

    public static void main(String[] args) {
        testConstructor();
        testConsultarCuentasIniciales();
        testNumeroDeCuentasInicial();
        testAgregarCuenta();
        testConsultarCuentas();
        testActualizarCuenta();
        testEliminarCuenta();
    }

    public static void testConstructor() {
        System.out.println("Prueba de Constructor:");
        cliente = new Cliente(1, "Daniel", "Torres"); // Inicializa el cliente
        System.out.println(cliente); // Muestra los detalles del cliente
    }

    public static void testConsultarCuentasIniciales() {
        System.out.println("\nConsultar Cuentas Iniciales:");
        System.out.println(cliente.getCuentas()); // Muestra las cuentas iniciales (vacías)
    }

    public static void testNumeroDeCuentasInicial() {
        System.out.println("\nNúmero de Cuentas Inicial:");
        System.out.println(cliente.getCuentas().length); // Número de cuentas que puede tener el cliente
    }

    public static void testAgregarCuenta() {
        System.out.println("\nAgregar Cuentas:");
        Cuenta cuenta1 = new Cuenta(1000.0);
        Cuenta cuenta2 = new Cuenta(5000.0);

        // Agregar cuentas al cliente
        if (cliente.agregarCuenta(cuenta1)) {
            System.out.println("Cuenta agregada con éxito: " + cuenta1);
        } else {
            System.out.println("No se pudo agregar la cuenta.");
        }

        if (cliente.agregarCuenta(cuenta2)) {
            System.out.println("Cuenta agregada con éxito: " + cuenta2);
        } else {
            System.out.println("No se pudo agregar la cuenta.");
        }
    }

    public static void testConsultarCuentas() {
        System.out.println("\nConsultar Cuentas del Cliente:");
        Cuenta[] cuentas = cliente.getCuentas();
        for (int i = 0; i < cuentas.length; i++) {
            if (cuentas[i] != null) {
                System.out.println("Cuenta " + (i + 1) + ": " + cuentas[i]);
            }
        }
    }

    public static void testActualizarCuenta() {
        System.out.println("\nActualizar Cuenta:");
        Cuenta cuentaActualizada = new Cuenta(3000.0);

        // Intentamos actualizar la primera cuenta (índice 0)
        if (cliente.actualizarCuenta(0, cuentaActualizada)) {
            System.out.println("Cuenta actualizada con éxito a: " + cuentaActualizada);
        } else {
            System.out.println("No se pudo actualizar la cuenta.");
        }
    }

    public static void testEliminarCuenta() {
        System.out.println("\nEliminar Cuenta:");
        if (cliente.eliminarCuenta(1)) {
            System.out.println("Cuenta eliminada correctamente.");
        } else {
            System.out.println("No se pudo eliminar la cuenta.");
        }

        // Consultar cuentas después de la eliminación
        System.out.println("\nCuentas después de eliminación:");
        testConsultarCuentas();
    }



}
