public class Persona {
    private Celular celular;
    private Telefonia compania;

    public Boolean celularApagado (){
        return this.celular.estaApagado();
    }

    public void setCelular(Celular celular){
        this.celular=celular;
    }

    public void setCompania(Telefonia compania){
        this.compania=compania;
    }

    public Telefonia getCompania() {
        return compania;
    }


}
