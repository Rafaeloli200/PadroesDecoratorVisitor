package Visitor;

public class Jato implements Nave {

    private int id;
    private String modelo;
    private String base;

    public Jato(int id, String modelo, String base) {
        this.id = id;
        this.modelo = modelo;
        this.base = base;
    }

    public int getId() {
        return id;
    }

    public String getModelo() {
        return modelo;
    }

    public String getBase() {
        return base;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirJato(this);
    }

}
