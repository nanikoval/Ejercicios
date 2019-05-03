public class Persona {
    private double gasto;

    public double getGasto() {
        return this.gasto;
    }

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

    //GASTO

    public void llamaA(Persona persona){
        gasto=gasto+this.compania.llamarA(1);
    }
}
