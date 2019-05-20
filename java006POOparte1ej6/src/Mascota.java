public class Mascota {
    private Integer nivel=0;

    public Integer getNivel() {
        return nivel;
    }
    public void incrementarNivel(Integer unidad){
        nivel=nivel+unidad;
    }

    private Estado estado=new Contenta();
    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    public Estado getEstado() {
        return estado;
    }


    //va a buscar COMER en el estado que corresponda:
    public void comer(){
        this.getEstado().comer(this);
    }
    public void jugar(){
        this.getEstado().jugar(this);
    }
}
