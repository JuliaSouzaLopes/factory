package factory.main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CargoContadorTest {

    @Test
    void deveRetornarCargoContador() {
        ICargo cargo = CargoFactory.obterCargo("Contador");
        assertEquals("Contador", servico.executar());
    }


}