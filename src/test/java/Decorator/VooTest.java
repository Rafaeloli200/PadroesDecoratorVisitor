package Decorator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VooTest {

    @Test
    void retornaTempoSemEscala() {
        Voo voo = new Viajem(14.0f);

        assertEquals(14.0f, voo.getTempo());
    }

    @Test
    void retornaTempoUmaEscala() {
        Voo voo = new Escala(3.0f, new Viajem(14.0f));

        assertEquals(17.0f, voo.getTempo());
    }

}
