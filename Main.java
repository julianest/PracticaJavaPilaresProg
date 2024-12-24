public class Main {
    public static void main(String[] args) {
        // Creamos la instancia de CuentaBancaria con número de cuenta y saldo inicial
        CuentaAhorro cuenta = new CuentaAhorro("123456789", 1000.0, 0.089);

        // Ej: 1. Realizamos un depósito de 500
        cuenta.depositar(500.0);

        // Ej: 2. Realizamos un retiro de 300
        //cuenta.retirar(300.0);

        // Ej: 3. Intentamos retirar más dinero del que hay en la cuenta 1600 (Imposible).
        //cuenta.retirar(1600.0);

        cuenta.mostrarEstadoCuenta();

        //Abstraccion: Se tiene acceso a lo necesario, ocultando los detalles internos de las funcionalidades (depositar, retirar y saldo).
    }
}
