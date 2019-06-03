import java.util.ArrayList;
import java.util.List;

public class Serie implements Contenido {
    private Usuario usuario;
    private List<Actor>actores;
    private Capitulo capitulo;
    private String genero;
    private Temporada temporada;


    public List<Actor> getActores() {
        return actores;
    }
    private Integer cantidadDeTemporadas;

    private List<Temporada> temporadasEnSerie = new ArrayList<>();

    public String getGenero() {
        return genero;
    }

    protected void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getCantidadDeTemporadas() {
        return cantidadDeTemporadas;
    }

    public void agregarTemporadaASerie(Temporada temporada) {

        this.temporadasEnSerie.add(temporada);
        this.setGenero(this.getGenero());

    }

    //PUNTO 1
    public Boolean estaVistoCompletoPor(Usuario usuario) {
        return usuario.getContenidosVistos().contains(this);
        //O bien return this.getCantidadDeTemporadas() == (temporadasEnSerie.size() + 1);
    }

    //PUNTO 2
    public Integer cuantoDura() {
        return this.temporadasEnSerie.stream().map(temporada -> temporada.cuantoDura()).reduce(0, Integer::sum);
    }

    //PUNTO 3
    public Capitulo ultimoCapituloDisponible() {
        return this.temporadasEnSerie.get(temporadasEnSerie.size() - 1).ultimoCapituloDisponibleDesdeTemp();
    }
    //PUNTO 5a:
    public Boolean actua(Actor actor){
        return actores.contains(actor);
    }


}