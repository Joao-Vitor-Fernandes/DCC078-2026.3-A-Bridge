package padroesestruturais.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaminhaoTest {

    @Test
    void deveRetornarDiariaCaminhaoComSeguroBasico() {
        Seguro seguro = new SeguroBasico();
        Caminhao caminhao = new Caminhao(200.0f);
        caminhao.setSeguro(seguro);
        caminhao.setCapacidadeCarga(5);
        assertEquals(300.0f, caminhao.calcularDiaria(), 0.01f);
    }

    @Test
    void deveRetornarDiariaCaminhaoComSeguroTerceiros() {
        Seguro seguro = new SeguroTerceiros();
        Caminhao caminhao = new Caminhao(200.0f);
        caminhao.setSeguro(seguro);
        caminhao.setCapacidadeCarga(5);
        assertEquals(330.0f, caminhao.calcularDiaria(), 0.01f);
    }

    @Test
    void deveRetornarDiariaCaminhaoComSeguroTotal() {
        Seguro seguro = new SeguroTotal();
        Caminhao caminhao = new Caminhao(200.0f);
        caminhao.setSeguro(seguro);
        caminhao.setCapacidadeCarga(5);
        assertEquals(360.0f, caminhao.calcularDiaria(), 0.01f);
    }
}