package Visitor;

public class Aviao implements Nave {

    private int id;
    private String modelo;

    public Aviao(int id, String modelo) {
        this.id = id;
        this.modelo = modelo;
    }

    public int getId() {
        return id;
    }

    public String getModelo() {
        return modelo;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirAviao(this);
    }

}
