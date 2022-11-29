package pagamentos;

import interfaces.EstrategiaPagamento;

import java.math.BigDecimal;

public class PagamentoCartaoCredito implements EstrategiaPagamento {

    @Override
    public void pagar(BigDecimal valor) {
        System.out.println("Pagou no crédito " + valor);
    }

}