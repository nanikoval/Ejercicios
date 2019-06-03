import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Usuario {

    private Contenido contenido;
    private List<Actor>actores=new ArrayList<>();
    private List<Contenido> contenidosVistos = new ArrayList<>();

    public List<Contenido> getContenidosVistos() {
        return contenidosVistos;
    }
    public Contenido getContenido() {
        return contenido;
    }
    public void play() {
        this.contenidosVistos.add(contenido);

    }

    public List<Actor> getActores() {
        return actores;
    }

    //PUNTO 1:
    public Boolean vioCompleto(Contenido contenido) {
        return this.contenido.estaVistoCompletoPor(this);

    }


    //PUNTO 4a:
    public Set generosVistosSinRepeticion(){
        return this.contenidosVistos.stream().map(contenido ->contenido.getGenero()).distinct().collect(Collectors.toSet());
    }

    //PUNTO 4b:
    public Integer minutosVistosDe(String genero){
        return this.getContenidosVistos().stream().filter(c -> c.getGenero().equals(genero)).mapToInt(c->c.cuantoDura()).sum();
    }
    /*public Set generoPreferido() {
        return this.contenidosVistos.stream().map(contenido -> contenido.getGenero()).
    }*/

    //PUNTO 5a:
    public Boolean actua(Actor actor){
        return this.getContenido().actua(actor);
    }

    //PUNTO 5b:
    public Boolean esFanDe(Actor actor){
        return this.contenidosVistos.stream().allMatch(c->c.getActores().contains(actor));
    }

    //PUNTO 6:
    /*public Contenido contenidosRecomendados(){
        this.contenidosVistos.stream()
    }*/

}