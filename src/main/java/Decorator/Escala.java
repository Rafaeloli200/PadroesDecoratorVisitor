package Decorator;

public class Escala extends VooDecorator {

    float aumento;

    public Escala(float aumento, Voo voo) {
        super(voo);
        this.aumento = aumento;
    }

    @Override
    public float getAumentoTempo() {
        return aumento;
    }

}
