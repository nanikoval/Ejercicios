public class Buscador implements Categoria {
    private Integer velocidad;
    private Integer skill;
    private Integer nivelDeReflejos;
    private Integer nivelDeVision;

    public Integer habilidadSegunCategoria(){
        return velocidad+skill+nivelDeReflejos+nivelDeVision;
    }
}
