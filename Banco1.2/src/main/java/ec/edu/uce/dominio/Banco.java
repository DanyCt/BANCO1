package ec.edu.uce.dominio;

public class Banco {
    private String nombre;
    private int id;
    private Cliente[] clientes; // Arreglo de clientes
    private Empleado[] empleados; // Arreglo de empleados
    private int numeroDeClientes;
    private int numeroDeEmpleados;

    // Constructor vacío
    public Banco() {
        this.nombre = "sin nombre";
        this.id = 1;
        this.clientes = new Cliente[3];  // Inicializa clientes con un arreglo de tamaño 3
        this.empleados = new Empleado[3];  // Inicializa empleados con un arreglo de tamaño 3
        this.numeroDeClientes = 0;
        this.numeroDeEmpleados = 0;
    }

    // Constructor con parámetros
    public Banco(String nombre, int capacidadClientes, int capacidadEmpleados) {
        this.nombre = nombre;
        this.id = id;
        this.clientes = new Cliente[capacidadClientes]; // Arreglo de clientes con capacidad definida
        this.empleados = new Empleado[capacidadEmpleados]; // Arreglo de empleados con capacidad definida
        this.numeroDeClientes = 0;
        this.numeroDeEmpleados = 0;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumeroDeClientes() {
        return numeroDeClientes;
    }

    public Cliente[] getClientes() {
        return clientes;
    }

    public int getNumeroDeEmpleados() {
        return numeroDeEmpleados;
    }

    public Empleado[] getEmpleados() {
        return empleados;
    }

    public void setNumeroDeClientes(int numeroDeClientes) {
        this.numeroDeClientes = numeroDeClientes;
    }

    public void setNumeroDeEmpleados(int numeroDeEmpleados) {
        this.numeroDeEmpleados = numeroDeEmpleados;
    }

    // Relación entre Banco y Cliente/Empleado

    public void setClientes(Cliente[] clientes) {
        if (clientes == null || clientes.length == 0) {
            System.out.println("Error: El arreglo de clientes no puede estar vacío.");
        } else {
            this.clientes = clientes;
        }
    }

    public void setEmpleados(Empleado[] empleados) {
        if (empleados == null || empleados.length == 0) {
            System.out.println("Error: El arreglo de empleados no puede estar vacío.");
        } else {
            this.empleados = empleados;
        }
    }

    @Override
    public String toString() {
        return "Banco{id=" + id +
                ", nombre='" + nombre + '\'' +
                ", numeroDeClientes=" + numeroDeClientes +
                ", numeroDeEmpleados=" + numeroDeEmpleados + '}';
    }

    // Métodos CRUD para Clientes

    public String consultarClientes() {
        String texto = "";
        for (int i = 0; i < numeroDeClientes; i++) {
            texto += clientes[i].toString() + "\r\n";
        }
        return texto;
    }

    public Cliente buscarCliente(int pos) {
        if (pos >= 0 && pos < numeroDeClientes) {
            return clientes[pos];
        } else {
            System.out.println("Error: Posición de cliente no válida.");
            return null;
        }
    }

    public void agregarCliente(int id, String nombre, String apellido) {
        if (numeroDeClientes >= clientes.length) {
            Cliente[] cliaux = clientes;
            clientes = new Cliente[numeroDeClientes + 1];
            System.arraycopy(cliaux, 0, clientes, 0, cliaux.length);
        }
        clientes[numeroDeClientes] = new Cliente(id, nombre, apellido);
        numeroDeClientes++;
    }

    public boolean editarCliente(int pos, String nombre, String apellido) {
        boolean resp = false;
        if (pos >= 0 && pos < numeroDeClientes) {
            Cliente clienteExistente = clientes[pos];
            clientes[pos] = new Cliente(clienteExistente.getId(), nombre, apellido);
            resp = true;
        }
        return resp;
    }

    public void eliminarCliente(int pos) {
        if (pos >= 0 && pos < numeroDeClientes) {
            Cliente[] cliaux = new Cliente[numeroDeClientes - 1];
            System.arraycopy(clientes, 0, cliaux, 0, pos);
            System.arraycopy(clientes, pos + 1, cliaux, pos, numeroDeClientes - pos - 1);
            clientes = cliaux;
            numeroDeClientes--;
        } else {
            System.out.println("Posición inválida para eliminar.");
        }
    }

    // Métodos CRUD para Empleados

    public String consultarEmpleados() {
        String texto = "";
        for (int i = 0; i < numeroDeEmpleados; i++) {
            texto += empleados[i].toString() + "\r\n";
        }
        return texto;
    }

    public Empleado buscarEmpleado(int pos) {
        if (pos >= 0 && pos < numeroDeEmpleados) {
            return empleados[pos];
        } else {
            System.out.println("Error: Posición de empleado no válida.");
            return null;
        }
    }

    public void agregarEmpleado(int id, String nombre, String apellido, double salario, String puesto) {
        if (numeroDeEmpleados >= empleados.length) {
            Empleado[] empAux = empleados;
            empleados = new Empleado[numeroDeEmpleados + 1];
            System.arraycopy(empAux, 0, empleados, 0, empAux.length);
        }
        empleados[numeroDeEmpleados] = new Empleado(id, nombre, apellido, salario, puesto);
        numeroDeEmpleados++;
    }

    public boolean editarEmpleado(int pos, String nombre, String apellido, double salario, String puesto) {
        boolean resp = false;
        if (pos >= 0 && pos < numeroDeEmpleados) {
            Empleado empleadoExistente = empleados[pos];
            empleados[pos] = new Empleado(empleadoExistente.getId(), nombre, apellido, salario, puesto);
            resp = true;
        }
        return resp;
    }

    public void eliminarEmpleado(int pos) {
        if (pos >= 0 && pos < numeroDeEmpleados) {
            Empleado[] empAux = new Empleado[numeroDeEmpleados - 1];
            System.arraycopy(empleados, 0, empAux, 0, pos);
            System.arraycopy(empleados, pos + 1, empAux, pos, numeroDeEmpleados - pos - 1);
            empleados = empAux;
            numeroDeEmpleados--;
        } else {
            System.out.println("Posición inválida para eliminar.");
        }
    }

    // Método de inicialización con clientes y empleados de ejemplo
    public void inicializar() {
        this.agregarCliente(1, "Ana", "Perez");
        this.agregarCliente(2, "Juan", "Lopez");
        this.agregarCliente(3, "Alejandra", "Cardenas");
        this.agregarCliente(4, "Jesus", "Lema");

        this.agregarEmpleado(1, "Carlos", "Gomez", 1200.0, "Cajero");
        this.agregarEmpleado(2, "Maria", "Perez", 1500.0, "Gerente");
        this.agregarEmpleado(3, "Luis", "Martinez", 1300.0, "Asistente");
        this.agregarEmpleado(4, "Laura", "Sanchez", 1400.0, "Supervisor");
    }
}
