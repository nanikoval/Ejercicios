import java.util.ArrayList;
import java.util.List;

public class Usuario {
public void peliculasQueVio(){
    List<Pelicula>peliculas=new ArrayList<>();
    peliculas.add(new Pelicula(120.0,"Actor 1, Actor 2"));
    peliculas.add(new Pelicula(130.0, "Actor 3"));
    peliculas.add(new Pelicula(120.0, "Actor 1"));
}
public void capitulosQueVio(){
    List<Capitulo>capitulos=new ArrayList<>();
    capitulos.add(new Capitulo("Actor 1", 40.0));
}


}
