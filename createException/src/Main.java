public class Main {
    public static void main(String[] args){
        Cuenta cuenta = new Cuenta();

        cuenta.setTitular("Natalia");
        cuenta.setSaldo(1000.55);

        System.out.println("Titular de la cuenta: "+cuenta.getTitular());
        System.out.println("Saldo disponible: "+cuenta.getSaldo());

        cuenta.ingresar(100.66);
        System.out.println("Saldo disponible: "+cuenta.getSaldo());

        //Intento retirar mas de lo que hay en la cuenta:
        cuenta.retirar(2000.57);
        System.out.println("Saldo disponible: "+cuenta.getSaldo());
    }
}
