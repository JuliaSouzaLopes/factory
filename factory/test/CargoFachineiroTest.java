package factory.main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CargoFachineiroTest {

    @Test
    void deveRetornarCargoFachineiro() {
        ICargo cargo = CargoFactory.obterCargo("Fachineiro");
        assertEquals("Fachineiro", servico.executar());
    }


}