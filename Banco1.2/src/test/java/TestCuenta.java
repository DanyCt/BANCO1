import ec.edu.uce.dominio.Cuenta;

public class TestCuenta {
    public static void main(String[] args) {
        // Crear una cuenta utilizando el constructor
        Cuenta cuenta = new Cuenta(1000.0);

        // Probar el método getter para obtener el saldo
        System.out.println("\n===== Probando método GETTER (saldo) =====");
        System.out.println("Saldo inicial de la cuenta: " + cuenta.getSaldo());

        // Cambiar el saldo utilizando el setter
        System.out.println("\n===== Probando método SETTER (saldo) =====");
        cuenta.setSaldo(1500.0);

        // Verificar que el saldo se cambió correctamente
        System.out.println("Nuevo saldo de la cuenta: " + cuenta.getSaldo());
    }
}
