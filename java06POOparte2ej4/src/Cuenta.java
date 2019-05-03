public class Cuenta {
    private String titular;
    private Double saldo;

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

    public Double ingresar(Double dinero){
        return (dinero>0)?(saldo=saldo+dinero):saldo;
    }
    public Double retirar(Double monto){
        return ((saldo-monto)<0)?saldo=0.0:(saldo=saldo-monto);
    }
}
