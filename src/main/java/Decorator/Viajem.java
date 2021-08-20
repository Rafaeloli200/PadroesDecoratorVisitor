package Decorator;

public class Viajem implements Voo {

    public float cargaHoraria;

    public Viajem() {
    }

    public Viajem(float cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public float getTempo() {
        return cargaHoraria;
    }

}
