public class Main {
    public static void main(String[]args){


        Micro elrapido=new Micro(20,20,200);

        Persona jonasa=new Claustrofobico();

        elrapido.sePuedeSubir(jonasa);

        System.out.println("Veamos si se puede subir una persona: "+elrapido.sePuedeSubir(new Claustrofobico()));



    }
}
