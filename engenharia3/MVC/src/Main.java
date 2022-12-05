public class Main {
    public static void main(String[] args) {

        CalculadoraView theView = new CalculadoraView();
        CalculadoraModel theModel = new CalculadoraModel();
        CalculadoraController theController = new CalculadoraController();

        theView.setVisible(true);

        System.out.println("Hello world!");
    }
}