import java.math.BigDecimal;

import pagamentos.PagamentoCartaoCredito;
import pagamentos.PagamentoCartaoDebito;

public class Main {
    public static void main(String[] args) {
        BigDecimal valor = new BigDecimal("10");
        Compra compra = new Compra(valor);

        compra.processarCompra(new PagamentoCartaoCredito());
        //compra.processarCompra(new PagamentoCartaoDebito());
    }
}