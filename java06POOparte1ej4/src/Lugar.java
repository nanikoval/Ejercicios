public class Lugar {
    private String nombre;

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String ciudad){
        nombre=ciudad;
    }

    private Integer kilometroEnRuta;
    public Integer getKilometroEnRuta() {
        return kilometroEnRuta;
    }
    public void setKilometroEnRuta(Integer kilometroEnRuta) {
        this.kilometroEnRuta = kilometroEnRuta;
    }
    public Integer distanciaHasta(Lugar destino){
        return getKilometroEnRuta() - destino.getKilometroEnRuta();
    }
}
