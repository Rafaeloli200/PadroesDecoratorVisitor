package Decorator;

public abstract class VooDecorator implements Voo {

    private Voo voo;

    public VooDecorator(Voo voo) {
        this.voo = voo;
    }

    public Voo getVoo() {
        return voo;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }

    public abstract float getAumentoTempo();

    @Override
    public float getTempo() {
        return this.voo.getTempo() + this.getAumentoTempo();
    }

}
