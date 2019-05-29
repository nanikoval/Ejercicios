import java.util.ArrayList;
import java.util.List;

public class Pelicula {
    private Double duracion;
    private String actores;

    public Pelicula(Double duracion, String actores){
        this.duracion=duracion;
        this.actores=actores;
    }

    public void peliculasVistas(){
        List<Pelicula>peliculas=new ArrayList<>();
        peliculas.add(new Pelicula(120.0,"Actor 1, Actor 2"));
        peliculas.add(new Pelicula(130.0, "Actor 3"));
        peliculas.add(new Pelicula(120.0, "Actor 1"));
    }
}
