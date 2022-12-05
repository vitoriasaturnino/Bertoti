import java.awt.event.ActionListener;
import javax.swing.*;

public class CalculadoraView extends JFrame{
    private JTextField primeiroNumero = new JTextField(10);
    private JLabel addOperador = new JLabel("+");
    private JTextField segundoNumero = new JTextField(20);
    private JButton botaoCalcular = new JButton("Calcular");
    private JTextField resultado = new JTextField(10);

    CalculadoraView() {
        JPanel painel = new JPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 200);

        painel.add(primeiroNumero);
        painel.add(addOperador);
        painel.add(segundoNumero);
        painel.add(botaoCalcular);
        painel.add(resultado);

        this.add(painel);
    }

    public int getPrimeiroNumero() {
       return Integer.parseInt(primeiroNumero.getText());
    }

    public int getSegundoNumero() {
        return Integer.parseInt(segundoNumero.getText());
    }

    public int getResultado() {
        return Integer.parseInt(resultado.getText());
    }

    public void setResultado(int valorResultado) {
        resultado.setText(Integer.toString(valorResultado));
    }

    void addCalculationListener(ActionListener listenForBotaoCalcular) {
        botaoCalcular.addActionListener(listenForBotaoCalcular);
    }

    void exibeErrorMessage(String errorMessage) {
        JOptionPane.showMessageDialog(this, errorMessage);
    }
}
