package Visitor;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NaveVisitorTest {

    @Test
    void exibeAviao() {
        Aviao aviao = new Aviao(1, "Boeing 747");
        NaveVisitor naveVisitor = new NaveVisitor();
        assertEquals("Aviao{id=1, modelo=Boeing 747}", naveVisitor.exibir(aviao));
    }

    @Test
    void exibeHeelicoptero() {
        Helicoptero helicoptero = new Helicoptero(1, "AH-64 Apache", "Galeao");
        NaveVisitor naveVisitor = new NaveVisitor();
        assertEquals("Helicoptero{id=1, modelo=AH-64 Apache, base=Galeao}", naveVisitor.exibir(helicoptero));
    }

    @Test
    void exibeJato() {
        Jato jato = new Jato(1, "Bombardier Global", "guarulhos");
        NaveVisitor naveVisitor = new NaveVisitor();
        assertEquals("Jato{id=1, modelo=Bombardier Global, base=guarulhos}", naveVisitor.exibir(jato));
    }

}
