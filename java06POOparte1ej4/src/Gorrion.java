public class Gorrion implements Ave {
    private Integer energia = 1000;
    public Integer costoFijo2=-20;

    public Integer getEnergia() {
        return energia;
    }

    public void setEnergia(Integer energia) {
        this.energia = energia;
    }
    public void volar(Integer kms) {
        this.energia = this.energia - 2*kms;
    }

    public void comer(Integer gramos) {
        this.energia = this.energia +3* gramos+costoFijo2;
    }
    public void hacerDeseo(){
        comer(100);
    }

}
