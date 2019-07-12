public class Cazador implements Categoria {
    private Integer velocidad;
    private Integer skill;
    private Integer punteria;
    private Integer fuerza;

    public Integer habilidadSegunCategoria(){
        return velocidad+skill+punteria*fuerza;
    }
}
