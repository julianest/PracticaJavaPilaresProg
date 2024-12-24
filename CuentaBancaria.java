public class CuentaBancaria {

    private String numeroCuenta;
    private double saldo;
    private double interesAcumulado = 0.0;

    public CuentaBancaria(String numeroCuenta, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println(" Depósito exitoso. Saldo actual: $" + saldo);
        } else {
            System.out.println(" El monto a depositar debe ser positivo.");
        }
    }

    public double obtenerSaldo() {
        return saldo;
    }
    public double obtenerSaldoSinInteres() {
        return saldo - interesAcumulado;
    }
    public double obtenerInteresAcumulado() {return interesAcumulado;}

    public double retirar(double monto){
        if(monto <= this.saldo){
            this.saldo -= monto;
            System.out.println("Retiro exitoso: $" + monto +" Saldo actual: $" + saldo);
            return monto;
        }else {
            System.out.println("Imposible retirar. el monto supera el saldo en cuenta: $" + saldo );
            return 0.0;
        }
    }

    public void mostrarEstadoCuenta(){
        String mensaje =
                String.format(
                        " - Saldo Sin intereses: $%.2f\n" +
                        " - Interés Acumulado:   $%.2f\n" +
                        " - Total total:         $%.2f",
                            obtenerSaldoSinInteres(), obtenerInteresAcumulado(), obtenerSaldo());
        System.out.println(mensaje);
    }

    //Encapsulamiento: protegemos los datos de la clase y exponemos lo necesario solo por getters y setters.
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getInteresAcumulado() {
        return interesAcumulado;
    }

    public void setInteresAcumulado(double interesAcumulado) {
        this.interesAcumulado = interesAcumulado;
    }
}
