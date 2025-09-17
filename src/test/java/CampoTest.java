import Modelo.Campo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CampoTest {

    private Campo campo;

    @BeforeEach
    void iniciarCampo() {
        campo = new Campo(3, 3);
    }

    @Test
    void testeVizinhoReal1(){
       Campo vizinho = new Campo(3, 2);
       boolean resultado = campo.adicionarVizinho(vizinho);
       assertTrue(resultado);
    }
}
