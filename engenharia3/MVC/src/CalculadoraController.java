import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraController {

    private CalculadoraView theView;
    private CalculadoraModel theModel;

    public CalculadoraController() {
        this.theView = theView;
        this.theModel = theModel;

        this.theView.addCalculationListener(new CalcuateListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        }) ;
    }

    abstract class CalcuateListener implements ActionListener {
        public void actioPerformed(ActionEvent arg0) {
            int primeiroNumero, segundoNumero = 0;

            try {
                primeiroNumero = theView.getPrimeiroNumero();
                segundoNumero = theView.getSegundoNumero();

                theModel.addNumeros(primeiroNumero, segundoNumero);

                theView.setResultado(theModel.getValorCalculado);
            } catch (NumberFormatException ex) {
                theView.exibeErrorMessage("Você precisa inserir dois valores inteiros");
            }
        }
    }
}
