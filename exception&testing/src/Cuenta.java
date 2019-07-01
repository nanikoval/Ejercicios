import UserException.UserException;

public class Cuenta {
    private String titular;
    private Double saldo=500.0;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }



    public void ingresar (Double dinero){
        if (dinero<0){
            throw new UserException("La cantidad debe ser positiva");
        }
        saldo=saldo+dinero;
    }


    public void retirar (Double monto){
        if (monto < 0) {
            throw new UserException("La cantidad a retirar debe ser positiva");
        }
        if (monto>saldo){
            throw new UserException("Debe retirar menos de "+saldo);
        }
        saldo=saldo-monto;
    }
}
