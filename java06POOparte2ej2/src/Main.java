public class Main {
    public static void main(String[] args){
        Libro libro = new Libro("Poesia","Borges",50,30);

        libro.setTitulo("Poesia completa");
        libro.setAutor("Borges");
        libro.setEjemplaresTotal(50);
        libro.setEjemplaresPrestaados(30);

        System.out.println("Titulo: "+libro.getTitulo());
        System.out.println("Autor: "+libro.getAutor());
        System.out.println("Numero total de ejemplares: "+libro.getEjemplaresTotal());
        System.out.println("Numero de ejemplares prestados: "+libro.getEjemplaresPrestaados());
        System.out.println("Ejemplares disponibles: "+(libro.getEjemplaresTotal()-libro.getEjemplaresPrestaados()));

        System.out.println("***********************************");
        libro.prestarLibro();
        System.out.println("Ejemplares prestados: "+libro.getEjemplaresPrestaados());

        libro.devolverLibro();
        System.out.println("Ejemplares prestados: "+libro.getEjemplaresPrestaados());
    }
}
