import java.util.ArrayList;
import java.util.List;

public class Pelicula implements Contenido{
    private String genero;
    private Usuario usuario;
    private Integer duracion;
    private List<Actor>actores;

    public String getGenero() {
        return genero;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public Pelicula(Integer duracion){
        this.duracion=duracion;
        //this.actores=actores;
    }

    List<Pelicula>peliculas=new ArrayList<>();

    public List<Actor> getActores() {
        return actores;
    }

    //PUNTO 1
    public Boolean estaVistoCompletoPor(Usuario usuario){
        return usuario.getContenidosVistos().contains(this);
        //return peliculas.contains(contenido);
    }

    //PUNTO 2
    public Integer cuantoDura(){
        return this.getDuracion();
    }

    //PUNTO 5a:
    public Boolean actua(Actor actor){
        return actores.contains(actor);
    }


}
