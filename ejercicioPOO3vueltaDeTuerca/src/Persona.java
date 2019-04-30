public class Persona {
    private String compania, claro, movistar, personal;

    public void setCompania(String compania) {
        this.compania = compania;
    }

    private Celular celular;

    public Boolean celularApagado (){
        return this.celular.estaApagado();
    }

    public void setCelular(Celular celular){
        this.celular=celular;
    }

    private double gasto;
    public void setGasto(double gasto){
        this.gasto=gasto;
    }
    public double getGasto() {
        return gasto;
    }
    public double llamarA (double minutos){
        if(compania=="personal") return (gasto=(minutos<=10?minutos*0.70:minutos*0.40));
        else if (compania=="movistar") return gasto=(0.6*minutos);
        else return gasto=(0.5*1*1.21);
    }

}
