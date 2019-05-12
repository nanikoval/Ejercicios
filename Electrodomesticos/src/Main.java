public class Main {
    public static void main(String[] args) {
        Lavadora lavadora = new Lavadora();
        System.out.println("Carga: "+lavadora.getCarga());
        System.out.println("Color lavadora: "+lavadora.getColor());
        //Lavadora lavadora1 = new Lavadora(300);
        System.out.println("Precio final lavadora: "+lavadora.precioFinal());



        Electrodomestico arrayElectrodomestico[]=new Electrodomestico[10];
        arrayElectrodomestico[0]=new Television(50, true);
        arrayElectrodomestico[1]=new Lavadora(40);
        arrayElectrodomestico[2]=new Lavadora(60);
        arrayElectrodomestico[3]=new Television(1500.0, 350);

        for (Electrodomestico electrodomestico : arrayElectrodomestico) {
            System.out.println("Precio final de electrodoméstico: "+electrodomestico.precioFinal());
        }

    }

}