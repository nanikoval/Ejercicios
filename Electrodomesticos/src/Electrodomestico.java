public class Electrodomestico {
    private Double precioBase;
    private String color;
    private Character consumoEnergetico;
    private Integer peso;

    //Constructor por defecto:
    public Electrodomestico() {
        this.precioBase = 100.0;
        this.color = "blanco";
        this.consumoEnergetico = 'F';
        this.peso = 5;
    }

    //Constructor con el precio y peso:
    public Electrodomestico(Double precioBase, Integer peso) {
        this.precioBase = precioBase;
        this.color = "blanco";
        this.consumoEnergetico = 'F';
        this.peso = peso;
    }

    /*//Constructor con todos los atributos:
    public Electrodomestico (Double precioBase, String color, Character consumoEnergetico, Integer peso){
        this.precioBase=precioBase;
        this.color=color;
        this.consumoEnergetico=consumoEnergetico;
        this.peso=peso;
    }*/

    public Integer getPeso() {
        return peso;
    }

    public String getColor() {
        return color;
    }

    public Double precioFinal() {
        return precioBase + plusPorConsumo()+plusPorTamanio();
    }

    private Double plusPorConsumo() {
        Double plus = 0.0;
        switch (this.consumoEnergetico) {
            case 'A':
                plus += 100;
                break;
            case 'B':
                plus += 80;
                break;
            case 'C':
                plus += 60;
                break;
            case 'D':
                plus += 50;
                break;
            case 'E':
                plus += 30;
                break;
            case 'F':
                plus += 10;
                break;
            default:
                plus += 0;
        }
    return plus;
    }

    private Double plusPorTamanio() {
        Double plus=0.0;
        if (peso>=0 && peso<19){
            plus+=10;
        } else if (peso>=20 && peso<49){
            plus+=50;
        } else if (peso>=50 && peso<=79){
            plus+=80;
        } else if (peso>=80){
            plus+=100;
        }
        return plus;
    }

}
