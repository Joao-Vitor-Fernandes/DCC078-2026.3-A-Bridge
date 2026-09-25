package padroesestruturais.bridge;

public abstract class Veiculo {
    protected Seguro seguro;
    protected float valorDiariaBase;

    public Veiculo(float valorDiariaBase) {
        this.valorDiariaBase = valorDiariaBase;
    }

    public void setSeguro(Seguro seguro) {
        this.seguro = seguro;
    }

    public void setValorDiariaBase(float valorDiariaBase) {
        this.valorDiariaBase = valorDiariaBase;
    }

    public abstract float calcularDiaria();
}
