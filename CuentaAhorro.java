public class CuentaAhorro extends CuentaBancaria {

    private double tasaInteres;

    public CuentaAhorro(String numeroCuenta, double saldo,  double tasaInteres){
        super(numeroCuenta, saldo);
        this.tasaInteres= tasaInteres;
    }

    @Override
    public void depositar(double monto) {
        super.depositar(monto);
        aplicarTasaInteres();
    }

    public void aplicarTasaInteres(){
        double interes = getSaldo() * tasaInteres;
        setInteresAcumulado(getInteresAcumulado() + interes) ;
        setSaldo(getSaldo()+interes);
        System.out.println(" Intereses Aplicados: $"+ interes);
    }

    public double getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(double tasaInteres) {
        if (tasaInteres < 0) {
            throw new IllegalArgumentException("La tasa de interés no puede ser negativa.");
        }
        this.tasaInteres = tasaInteres;
    }

    //Herencia: Por medio de CuentaAhorro heredamos las caracteristicas y comportamientos de una clase padre CuentaBancaria.
    //Polimorfismo: La sobreescritura del método depositar en CuentaAhorro modifica el comportamiento heredado de CuentaBancaria al agregar la aplicación de una tasa de interés.
}
