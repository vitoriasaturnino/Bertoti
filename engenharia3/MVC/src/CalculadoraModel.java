public class CalculadoraModel {
    public int getValorCalculado;
    private int valorCalculado;

    public void addNumeros(int primeiroNumero, int segundoNumero) {
        valorCalculado = primeiroNumero + segundoNumero;
    }

    public int Resultado() {
        return valorCalculado;
    }
}
