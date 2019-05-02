public class Main {
    public static void main(String[] args) {

        Samsung celSamsung = new Samsung();
        Iphone celIphone = new Iphone();
        Iphone celIphone2 = new Iphone();
        Iphone celIphone3 = new Iphone();

        Claro claro = new Claro();
        Movistar movistar = new Movistar();
        Personal personal = new Personal();

        System.out.println(celSamsung.getBateria());
        System.out.println(celIphone.getBateria());
        System.out.println(celIphone2.getBateria());
        System.out.println(celIphone3.getBateria());

        celSamsung.llamar(1.0);
        celIphone.llamar(2.0);
        celIphone2.llamar(3);
        celIphone3.llamar(6);

        System.out.println(celSamsung.getBateria());
        System.out.println(celIphone.getBateria());
        System.out.println(celIphone2.getBateria());
        System.out.println(celIphone3.getBateria());

        System.out.println(celSamsung.estaApagado());
        System.out.println(celIphone.estaApagado());
        System.out.println(celIphone2.estaApagado());
        System.out.println(celIphone3.estaApagado());

        celSamsung.recargar();
        celIphone.recargar();
        celIphone2.recargar();
        celIphone3.recargar();

        System.out.println(celSamsung.getBateria());
        System.out.println(celIphone.getBateria());
        System.out.println(celIphone2.getBateria());
        System.out.println(celIphone3.getBateria());

        Persona juliana = new Persona();
        Persona catalina = new Persona();
        Persona juan = new Persona();
        Persona ernesto = new Persona();

        juliana.setCelular(celSamsung);
        catalina.setCelular(celIphone);
        juan.setCelular(celIphone2);
        ernesto.setCelular(celIphone3);

        System.out.println(juliana.celularApagado());
        System.out.println(catalina.celularApagado());
        System.out.println(juan.celularApagado());
        System.out.println(ernesto.celularApagado());

        juliana.setCompania(personal);
        catalina.setCompania(movistar);

        personal.setNombre("Personal");
        movistar.setNombre("Movistar");
        System.out.println(juliana.getCompania().getNombre());
        System.out.println(catalina.getCompania().getNombre());


    }
}
