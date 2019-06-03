import java.util.List;

public interface Contenido {
    Integer cuantoDura();
    Boolean estaVistoCompletoPor(Usuario usuario);
    String getGenero();
    Boolean actua(Actor actor);
    List<Actor> getActores();
}