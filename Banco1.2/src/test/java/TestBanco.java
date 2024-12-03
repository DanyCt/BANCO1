import ec.edu.uce.dominio.Banco;

public class TestBanco {
    private static Banco b; // Objeto Banco para realizar las pruebas

    public static void main(String[] args) {
        testConstructor();
        testConsultarClientesIniciales();
        testNumeroDeClientesInicial();
        testAgregarClientes();
        testConsultarClientes();
        testBuscarCliente();
        testConsultarEmpleadosIniciales();
        testNumeroDeEmpleadosInicial();
        testAgregarEmpleados();
        testConsultarEmpleados();
        testBuscarEmpleado();
        testInicializarBanco();
        testEditarCliente();
        testEliminarCliente();
        testEditarEmpleado();
        testEliminarEmpleado();
    }

    public static void testConstructor() {
        System.out.println("Prueba de Constructor:");
        b = new Banco(); // Inicializa Banco
    }

    public static void testConsultarClientesIniciales() {
        System.out.println("\nConsultar Clientes Iniciales:");
        System.out.println(b.consultarClientes()); // Muestra los clientes iniciales
    }

    public static void testNumeroDeClientesInicial() {
        System.out.println("\nNúmero de Clientes Inicial:");
        System.out.println(b.getNumeroDeClientes()); // Número inicial de clientes
    }

    public static void testAgregarClientes() {
        System.out.println("\nAgregar Clientes:");
        b.agregarCliente(5, "Ana", "Perez");
        b.agregarCliente(6, "Juana", "Luna");
    }

    public static void testConsultarClientes() {
        System.out.println("\nConsultar Clientes:");
        System.out.println(b.consultarClientes()); // Lista de clientes actualizada
    }

    public static void testBuscarCliente() {
        System.out.println("\nBuscar Cliente en posición 1:");
        System.out.println(b.buscarCliente(1)); // Buscar cliente en la posición 1
    }

    public static void testConsultarEmpleadosIniciales() {
        System.out.println("\nConsultar Empleados Iniciales:");
        System.out.println(b.consultarEmpleados()); // Muestra los empleados iniciales
    }

    public static void testNumeroDeEmpleadosInicial() {
        System.out.println("\nNúmero de Empleados Inicial:");
        System.out.println(b.getNumeroDeEmpleados()); // Número inicial de empleados
    }

    public static void testAgregarEmpleados() {
        System.out.println("\nAgregar Empleados:");
        b.agregarEmpleado(5, "Carlos", "Gomez", 1400.0, "Cajero");
        b.agregarEmpleado(6, "Lucia", "Martinez", 1600.0, "Gerente");
    }

    public static void testConsultarEmpleados() {
        System.out.println("\nConsultar Empleados:");
        System.out.println(b.consultarEmpleados()); // Lista de empleados actualizada
    }

    public static void testBuscarEmpleado() {
        System.out.println("\nBuscar Empleado en posición 1:");
        System.out.println(b.buscarEmpleado(1)); // Buscar empleado en la posición 1
    }

    public static void testInicializarBanco() {
        System.out.println("\nInicializando Banco:");
        b = new Banco(); // Inicializa Banco con datos
        b.inicializar();
        System.out.println(b.consultarClientes());
        System.out.println(b.consultarEmpleados());
    }

    public static void testEditarCliente() {
        System.out.println("\nEditar Cliente:");
        if (!b.editarCliente(0, "Daniel", "Torres")) {
            System.out.println("Error al modificar cliente.");
        }
        System.out.println(b.consultarClientes());
    }

    public static void testEliminarCliente() {
        System.out.println("\nEliminar Cliente en la posición 0 (Primero):");
        b.eliminarCliente(0);
        testConsultarClientes(); // Consulta después de eliminar

        System.out.println("\nEliminar Cliente en la posición 2 (Del Medio):");
        b.eliminarCliente(2);
        testConsultarClientes(); // Consulta después de eliminar

        System.out.println("\nEliminar Cliente en la posición 3 (Último):");
        b.eliminarCliente(b.getNumeroDeClientes() - 1);
        testConsultarClientes(); // Consulta después de eliminar
    }

    public static void testEditarEmpleado() {
        System.out.println("\nEditar Empleado:");
        if (!b.editarEmpleado(0, "Luis", "Sánchez", 1500.0, "Supervisor")) {
            System.out.println("Error al modificar empleado.");
        }
        System.out.println(b.consultarEmpleados());
    }

    public static void testEliminarEmpleado() {
        System.out.println("\nEliminar Empleado en la posición 0 (Primero):");
        b.eliminarEmpleado(0);
        testConsultarEmpleados(); // Consulta después de eliminar

        System.out.println("\nEliminar Empleado en la posición 2 (Del Medio):");
        b.eliminarEmpleado(2);
        testConsultarEmpleados(); // Consulta después de eliminar

        System.out.println("\nEliminar Empleado en la posición 3 (Último):");
        b.eliminarEmpleado(b.getNumeroDeEmpleados() - 1);
        testConsultarEmpleados(); // Consulta después de eliminar
    }
}
