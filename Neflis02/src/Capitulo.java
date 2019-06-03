import java.util.List;

public class Capitulo implements Contenido {
    private Serie serie;
    private String genero;
    private Usuario usuario;
    private  Integer numero;
    private List<Actor>actores;
    private String nombre;

    public List<Actor> getActores() {
        return actores;
    }
    private Integer duracion;

    public Capitulo (Integer numero, String nombre, Integer duracion, String genero){
        this.numero = numero;
        this.nombre = nombre;
        this.duracion = duracion;
        this.genero = genero;
    }


    public Integer getNumero() {
        return numero;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public String getGenero() {
        return genero;
    }

    //PUNTO 1
    public Boolean estaVistoCompletoPor(Usuario usuario){
        return usuario.getContenidosVistos().contains(this);
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