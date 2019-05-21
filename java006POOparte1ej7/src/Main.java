import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Prenda> prendas = new ArrayList<>();
        prendas.add(new Prenda("sacos", 1300.0));
        prendas.add(new Prenda("pantalones", 1250.0));
        prendas.add(new Prenda("camisas", 1200.0));


        //reocorro la lista y pudo los nombres:
        for (int i = 0; i < prendas.size(); i++) {
            System.out.println("Nombre de la prenda: " + prendas.get(i).getNombre());
        }

        System.out.println("****************************");

        //reocorro la lista y pudo los precios:
        for (int i = 0; i < prendas.size(); i++) {
            System.out.println("Precio de la prenda: " + prendas.get(i).getPrecio());
        }

        System.out.println("****************************");

        //precio total de las prendas:
        Double precioTotal=prendas.stream().map(prenda -> prenda.getPrecio()).reduce(0.0,Double::sum);
        System.out.println("Precio total: "+precioTotal);

        System.out.println("****************************");

        //recorro recolectando precio final y nombre de cada prenda:
        for (int i = 0; i < prendas.size(); i++) {
            System.out.println("Precio final de los/as " + prendas.get(i).getNombre()+" : "+prendas.get(i).precioFinal());
        }

        System.out.println("****************************");

        //una venta del 21 de mayo:
        Ventas venta01 = new Ventas("pantalon", 1500.0, 2, "21/05/19");
        System.out.println("Prenda vendida: "+venta01.getNombre());
        System.out.println("Precio de la prenda vendida: "+venta01.getPrecio());
        System.out.println("Cantidad vendida: "+venta01.getCantidad());
        System.out.println("Fecha de la venta: "+venta01.getFecha());

        System.out.println("****************************");

        //listado de prendas vendidas el 21 de mayo:
        Ventas arrayVentas[]=new Ventas[5];
        arrayVentas[0]=new Ventas("camisa",1300.0,3,"21/05/19");
        arrayVentas[1]=new Ventas("saco",1450.0,2,"21/05/19");
        arrayVentas[2]=new Ventas("pantalon",1700.0,1,"21/05/19");
        arrayVentas[3]=new Ventas("saco",2000.0,4,"21/05/19");
        arrayVentas[4]=new Ventas("camisa",1100.0,1,"21/05/19");

        for(Ventas ventas:arrayVentas){
            System.out.println(ventas.getCantidad());
        }

    }
}
