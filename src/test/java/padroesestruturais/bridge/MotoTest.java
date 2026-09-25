package padroesestruturais.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MotoTest {

    @Test
    void deveRetornarDiariaMotoComSeguroBasico() {
        Seguro seguro = new SeguroBasico();
        Moto moto = new Moto(100.0f);
        moto.setSeguro(seguro);
        assertEquals(100.0f, moto.calcularDiaria(), 0.01f);
    }

    @Test
    void deveRetornarDiariaMotoComSeguroTerceiros() {
        Seguro seguro = new SeguroTerceiros();
        Moto moto = new Moto(100.0f);
        moto.setSeguro(seguro);
        assertEquals(110.0f, moto.calcularDiaria(), 0.01f);
    }

    @Test
    void deveRetornarDiariaMotoComSeguroTotal() {
        Seguro seguro = new SeguroTotal();
        Moto moto = new Moto(100.0f);
        moto.setSeguro(seguro);
        assertEquals(120.0f, moto.calcularDiaria(), 0.01f);
    }
}
