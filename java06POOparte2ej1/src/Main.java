public class Main {
    public static void main (String[] args){
        Reloj reloj = new Reloj();

        reloj.setHoras(16);
        reloj.setMinutos(57);
        reloj.setSegundos(59);

        System.out.println(reloj.getHoraActual());
        System.out.println(reloj.getHoraAmPm());
    }
}
