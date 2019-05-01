public class Reloj {
    Integer horas, minutos, segundos;

    public String getHoraActual(){
        return horas.toString()+":"+minutos.toString()+":"+segundos.toString();
    }

    public String getHoraAmPm(){
        if (horas>12) return (horas-12)+":"+minutos.toString()+" pm";
        else return horas.toString()+minutos.toString()+"am";
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
