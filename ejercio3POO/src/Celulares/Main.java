package Celulares;

public class Main {
    public static void main(String[] args) {

        Samsung celSamsung = new Samsung();
        Iphone celIphone = new Iphone();

        System.out.println(celSamsung.getBateria());
        System.out.println(celIphone.getBateria());

        celSamsung.llamar(1.0);
        celIphone.llamar(2.0);

        System.out.println(celSamsung.getBateria());
        System.out.println(celIphone.getBateria());

        System.out.println(celSamsung.estaApagado());
        System.out.println(celIphone.estaApagado());

        celSamsung.recargar();
        celIphone.recargar();

        System.out.println(celSamsung.getBateria());
        System.out.println(celIphone.getBateria());

        Persona juliana = new Persona();
        Persona catalina = new Persona();

        juliana.setCelular(celSamsung);
        catalina.setCelular(celIphone);

        System.out.println(juliana.celularApagado());
        System.out.println(catalina.celularApagado());

        juliana.personalLlamar(11);
        catalina.movistarLlamar(5);

        System.out.println(juliana.getGasto());
        System.out.println(catalina.getGasto());
    }
}
