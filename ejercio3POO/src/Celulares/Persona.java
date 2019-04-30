package Celulares;

public class Persona {

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
    public void personalLlamar(double minutos){
        this.gasto=(minutos<=10?minutos*0.70:minutos*0.40);
    }
    public void claroLlamar(double minutos){
        this.gasto=(0.5*minutos*1.21);
    }
    public void movistarLlamar(double minutos){
        this.gasto=(0.6*minutos);
    }
}
