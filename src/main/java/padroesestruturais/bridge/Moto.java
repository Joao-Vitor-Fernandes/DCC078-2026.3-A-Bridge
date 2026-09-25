package padroesestruturais.bridge;

public class Moto extends Veiculo{

    public Moto(float valorDiariaBase) {
        super(valorDiariaBase);
    }

    public float calcularDiaria() {
        return this.valorDiariaBase * (1 + this.seguro.percentualAcrescimo());
    }
}
