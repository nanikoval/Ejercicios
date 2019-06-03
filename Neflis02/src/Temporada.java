import java.util.ArrayList;
import java.util.List;

public class Temporada implements Contenido{
    private String genero;
    private Serie serie;
    private Capitulo capitulo;
    private List<Actor>actores;
    private Integer numero;

    public List<Actor> getActores() {
        return actores;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    private Integer cantidadDeCapitulos;   //pensar si es necesario un array fijo

    private List<Capitulo> capitulosEnTemporada = new ArrayList<>();

    public Integer getCantidadDeCapitulos() {
        return cantidadDeCapitulos;
    }

    public void agregarCapitulosATemporada(Capitulo capitulo){

        this.capitulosEnTemporada.add(capitulo);
        this.setGenero(this.getGenero());

    }


    public List<Capitulo> getCapitulosEnTemporada() {

        return capitulosEnTemporada;

    }

    public Integer getNumero() {
        return numero;
    }

    //PUNTO 1
    public Boolean estaVistoCompletoPor(Usuario usuario){
        return usuario.getContenidosVistos().contains(this);
        //o bien return this.getCantidadDeCapitulos()==(capitulosEnTemporada.size()+1);
    }

    //PUNTO 2
    public Integer cuantoDura() {

        return this.capitulosEnTemporada.stream().map(capitulo -> capitulo.getDuracion()).reduce(0,Integer::sum);

    }

    //PUNTO 3 (responsabilidad en Serie)
    public Capitulo ultimoCapituloDisponibleDesdeTemp(){

        return this.capitulosEnTemporada.get(capitulosEnTemporada.size()-1);

    }

    //PUNTO 5a:
    public Boolean actua(Actor actor){
        return actores.contains(actor);
    }


}
