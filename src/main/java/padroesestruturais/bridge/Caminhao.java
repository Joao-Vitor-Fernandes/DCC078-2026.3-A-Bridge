package padroesestruturais.bridge;

public class Caminhao extends Veiculo{

    private int capacidadeCarga; // em toneladas

    public Caminhao(float valorDiariaBase) {
        super(valorDiariaBase);
    }

    public void setCapacidadeCarga(int capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    public float calcularDiaria() {
        float baseComCarga = this.valorDiariaBase + (this.capacidadeCarga * 20.0f);

        return baseComCarga * (1 + this.seguro.percentualAcrescimo());
    }
}
