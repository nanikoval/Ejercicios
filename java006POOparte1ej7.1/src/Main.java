public class Main {
    public static void main(String[] args){
    Saco saco=new Saco("Saco", 2, "23/05/19");
    System.out.println("Precio final del saco: "+saco.precioFinal());

    Camisa camisa=new Camisa("Camisa", 1, "23/05/19");
    System.out.println("Precio final de la camisa: "+camisa.precioFinal());

    Pantalon pantalon=new Pantalon("Pantalon", 3, "23/05/19");
    System.out.println("Precio final del pantalon: "+pantalon.precioFinal());

    System.out.println("*********************************");

    Prenda arrayPrenda[]=new Prenda[3];
    arrayPrenda[0]=new Camisa("camisa", 3, "23/05/19");
    arrayPrenda[1]=new Pantalon("pantalon", 5, "23/05/19");
    arrayPrenda[2]=new Saco("saco", 9, "23/05/19");


    for (Prenda prenda: arrayPrenda) {
        System.out.println("Precio final de la prenda: "+prenda.precioFinal());
    }

    }

}