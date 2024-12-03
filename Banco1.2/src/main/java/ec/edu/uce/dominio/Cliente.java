package ec.edu.uce.dominio;

public class Cliente {
    private int id;
    private String nombre;
    private String apellido;
    private Cuenta cuenta[];
    private int numCuentas;

    public Cliente() {
        this.id = 1;
        this.nombre = "Daniel";
        this.apellido = "Torres";
        this.cuenta = new Cuenta[3];  // Un cliente puede tener hasta 3 cuentas.
        this.numCuentas = 0;
    }

    // Constructor con Parámetros
    public Cliente(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cuenta = new Cuenta[3];  // Un cliente puede tener hasta 3 cuentas.
        this.numCuentas = 0;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Cuenta[] getCuentas() {
        return cuenta;
    }

    // CRUD: Crear (agregar una cuenta)
    public boolean agregarCuenta(Cuenta cuenta) {
        if (numCuentas < this.cuenta.length) {
            this.cuenta[numCuentas] = cuenta;
            numCuentas++;
            return true;
        }
        return false; // No hay espacio para más cuentas
    }

    // CRUD: Leer (consultar una cuenta por índice)
    public Cuenta obtenerCuenta(int index) {
        if (index >= 0 && index < numCuentas) {
            return cuenta[index];
        }
        return null; // Si no existe cuenta en ese índice
    }

    // CRUD: Actualizar (modificar una cuenta)
    public boolean actualizarCuenta(int index, Cuenta cuenta) {
        if (index >= 0 && index < numCuentas) {
            this.cuenta[index] = cuenta;
            return true;
        }
        return false; // Índice fuera de rango
    }

    // CRUD: Eliminar (eliminar una cuenta)
    public boolean eliminarCuenta(int index) {
        if (index >= 0 && index < numCuentas) {
            for (int i = index; i < numCuentas - 1; i++) {
                this.cuenta[i] = this.cuenta[i + 1]; // Desplazar las cuentas hacia adelante
            }
            this.cuenta[numCuentas - 1] = null; // Eliminar la última cuenta
            numCuentas--;
            return true;
        }
        return false; // Índice fuera de rango
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{id=").append(id)
                .append(", nombre='").append(nombre)
                .append("', apellido='").append(apellido)
                .append("', cuentas=[");

        for (int i = 0; i < numCuentas; i++) {
            sb.append(cuenta[i].toString());
            if (i < numCuentas - 1) {
                sb.append(", ");
            }
        }
        sb.append("]}");
        return sb.toString();
    }



}
