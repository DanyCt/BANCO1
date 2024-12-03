package ec.edu.uce.dominio;

public class Empleado {
    private int id;
    private String nombre;
    private String apellido;
    private double salario;
    private String puesto;

    public Empleado() {
        this.id = 1;
        this.nombre = "Juan";
        this.apellido = "Pérez";
        this.salario = 1000.0;
        this.puesto = "Asistente";
    }

    // Constructor con parámetros
    public Empleado(int id, String nombre, String apellido, double salario, String puesto) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
        this.puesto = puesto;
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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    @Override
    public String toString() {
        return "Empleado{id=" + id
                + ", nombre='" + nombre
                + "', apellido='" + apellido
                + "', salario=" + salario
                + ", puesto='" + puesto + "'}";
    }
}
