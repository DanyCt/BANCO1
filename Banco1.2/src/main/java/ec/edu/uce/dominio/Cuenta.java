
package ec.edu.uce.dominio;
public class Cuenta {
    private double saldo;
    private int numeroCuenta;




    // Constructor
    public Cuenta(double saldo) {

        this.saldo = saldo;
        this.numeroCuenta=0;


    }

    // Getter y Setter
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cuenta{saldo=" + saldo + "}";
    }
}
