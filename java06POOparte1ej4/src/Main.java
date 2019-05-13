public class Main {
    public static void main(String[] args){
        Lugar bsAs=new Lugar();
        bsAs.setNombre("Buenos Aires");
        Lugar rosario=new Lugar();
        rosario.setNombre(("Rosario"));
        Lugar cordoba=new Lugar();
        cordoba.setNombre("Cordoba");


        Golondrina pepita=new Golondrina("Pepa", 300);
        pepita.setEnergia(1000);
        pepita.volar(20);
        pepita.comer(500);
        pepita.setUbicacion(bsAs);
        pepita.getUbicacion();

        bsAs.setKilometroEnRuta(0);
        rosario.setKilometroEnRuta(253);
        cordoba.setKilometroEnRuta(702);

        System.out.println("Energia de Pepita: "+pepita.getEnergia());
        System.out.println("Caracteres de 'Buenos Aires': "+pepita.getUbicacion().getNombre().length());
        System.out.println("Ubicacion de Pepita: "+pepita.getUbicacion().getNombre());
        System.out.println("Rosario esta en el km: "+rosario.getKilometroEnRuta());
        System.out.println("Distancia entre Cordoba y Rosario: "+cordoba.distanciaHasta(rosario));

        pepita.volarA(bsAs);
        System.out.println("Pepita esta en: "+pepita.getUbicacion().getNombre());
        pepita.volarA(rosario);
        System.out.println("Volo hasta: "+pepita.getUbicacion().getNombre());

        pepita.setEnergia(0);
        pepita.volarA(cordoba);
        System.out.println("Ubicacion de Pepita es la misma porque no tenia energia para volar a Cordoba: "+pepita.getUbicacion().getNombre());

        pepita.setEnergia(500);
        Susana susana = new Susana();
        susana.entrena(pepita);
        System.out.println("Energia de Pepita despues de entrenarse: "+pepita.getEnergia());

        Gorrion pepon = new Gorrion();
        pepon.setEnergia(1000);
        Roque roque = new Roque();
        roque.entrena(pepon);
        System.out.println("Energia de Pepon despues de entrenarse: "+pepon.getEnergia());

        Golondrina jonasa = new Golondrina("Jonasa",400);
        Golondrina ernestina = new Golondrina("Ernestina", 500);
        susana.entrena(ernestina);
        System.out.println("Energia de Ernestina luego de entrenarse con Susana: "+ernestina.getEnergia());

        System.out.println("********************************************************");

        pepita.setEnergia(600);
        System.out.println("Energia de Pepita: "+pepita.getEnergia());
        pepita.hacerDeseo();
        System.out.println("Energia de Pepita luego de hacer su deseo: "+pepita.getEnergia());

    }

}