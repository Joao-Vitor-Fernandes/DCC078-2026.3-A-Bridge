package padroesestruturais.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarroTest {

    @Test
    void deveRetornarDiariaCarroComSeguroBasico() {
        Seguro seguro = new SeguroBasico();
        Carro carro = new Carro(100.0f);
        carro.setSeguro(seguro);
        assertEquals(150.0f, carro.calcularDiaria(), 0.01f);
    }

    @Test
    void deveRetornarDiariaCarroComSeguroTerceiros() {
        Seguro seguro = new SeguroTerceiros();
        Carro carro = new Carro(100.0f);
        carro.setSeguro(seguro);
        assertEquals(165.0f, carro.calcularDiaria(), 0.01f);
    }

    @Test
    void deveRetornarDiariaCarroComSeguroTotal() {
        Seguro seguro = new SeguroTotal();
        Carro carro = new Carro(100.0f);
        carro.setSeguro(seguro);
        assertEquals(180.0f, carro.calcularDiaria(), 0.01f);
    }
}