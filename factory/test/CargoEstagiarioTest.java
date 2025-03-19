package factory.main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CargoEstagiarioTest {

    @Test
    void deveRetornarCargoEstagiario() {
        ICargo cargo = CargoFactory.obterCargo("Estagiario");
        assertEquals("Estagiário", servico.executar());
    }

}