package padroesestruturais.bridge;

public class Carro extends Veiculo{

    public Carro(float valorDiariaBase) {
        super(valorDiariaBase);
    }

    public float calcularDiaria() {
        return (this.valorDiariaBase * 1.5f) * (1 + this.seguro.percentualAcrescimo());
    }
}
