public class Main {
    public static void main(String []args){

        Mascota tamagotchi = new Mascota();
        System.out.println("Estado inicial: " +tamagotchi.getEstado());

        tamagotchi.jugar();
        System.out.println("Estado despues de jugar estando contenta: "+tamagotchi.getEstado());

        tamagotchi.comer();
        System.out.println("Estado despues de comer estando hambrienta: "+tamagotchi.getEstado());

        tamagotchi.jugar();
        tamagotchi.jugar();
        System.out.println("Nivel despues de haber jugado estando contenta: "+tamagotchi.getNivel());

        System.out.println("Estado despues de jugar estando contenta: "+tamagotchi.getEstado());
        System.out.println("Puede jugar hambrienta: "+tamagotchi.podesJugar());

        tamagotchi.setEstado(new Contenta());
        System.out.println("Puede jugar contenta: "+tamagotchi.podesJugar());

    }
}
