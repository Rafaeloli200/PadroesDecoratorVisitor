package Visitor;

public class NaveVisitor implements Visitor {

    public String exibir(Nave nave) {
        return nave.aceitar(this);
    }

    @Override
    public String exibirAviao(Aviao aviao) {
        return "Aviao{" +
                "id=" + aviao.getId() +
                ", modelo=" + aviao.getModelo() +
                '}';
    }

    @Override
    public String exibirHelicoptero(Helicoptero helicoptero) {
        return "Helicoptero{" +
                "id=" + helicoptero.getId() +
                ", modelo=" + helicoptero.getModelo()  +
                ", base=" + helicoptero.getBase()  +
                '}';
    }

    @Override
    public String exibirJato(Jato jato) {
        return "Jato{" +
                "id=" + jato.getId() +
                ", modelo=" + jato.getModelo()  +
                ", base=" + jato.getBase() +
                '}';
    }
}
