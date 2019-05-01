public class Reloj {
    Integer horas, minutos, segundos;

    public String getHoraActual(){
        return horas.toString()+":"+minutos.toString()+":"+segundos.toString();
    }

    public String getHora24hs(){
        if (horas>12) return (24-12)+":"+minutos+" pm";
        else return horas+minutos+"am";
    }

    public void setHoras(Integer laHora){
        horas=laHora;
    }
    public void setMinutos(Integer losMinutos){
        minutos=losMinutos;
    }
    public void setSegundos(Integer losSegundos){
        segundos=losSegundos;
    }

}
