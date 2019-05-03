public class Main {
    public static void main(String[] args){
        Cuenta cuenta = new Cuenta();

        cuenta.setTitular("Natalia");
        cuenta.setSaldo(1000.55);

        System.out.println("Titular de la cuenta: "+cuenta.getTitular());
        System.out.println("Saldo disponible: "+cuenta.getSaldo());

        cuenta.ingresar(100.45);
        System.out.println("Saldo disponible: "+cuenta.getSaldo());

        cuenta.retirar(2000.57);
        System.out.println("Saldo disponible: "+cuenta.getSaldo());
    }
}
