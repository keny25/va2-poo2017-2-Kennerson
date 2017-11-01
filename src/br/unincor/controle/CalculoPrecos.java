package br.unincor.controle;

import br.unincor.exception.PrecoZeradoException;
import br.unincor.model.Produto;
import br.unincor.model.Sanduiche;;

public class CalculoPrecos {
	
	/**
	 * Primeiro deve-se testar se o preço do produto não está 'null'
	 * 		- Caso o preço esteja zerado ('null'), lançar uma PrecoZeradoException
	 * 
	 * Realizar o cálculo do preço final do produto seguindo as regras:
	 * 
	 * Sanduiche:
	 * 		- Trio: se for TRUE acrescenta R$XX,XX no preço (valor referente a batata e bebida)
	 * 		- Dobro de recheio: ser for TRUE acresce o preço em XX%
	 * 
	 * Sobremesa:
	 * 		- Adicionais: se for TRUE acresce o preço em XX%
	 * 
	 */
	private void calculaPrecoFinal(Produto p) throws PrecoZeradoException{
	if (p.getPreco() != null) {
		Sanduiche s = new Sanduiche(null, null, null, null);
		double valor = 0;
		if (s.getTrio() == true) {
			valor = p.getPreco() + 10.0;
			p.setPreco(valor);
		}
		
		if (s.getDobroRecheio() == true) {
			valor = valor*20/100;
			p.setPreco(valor);
		}
	} else {
		throw new PrecoZeradoException();
	}
		
	
	
		
	}
	
	/**
	 * No pagamento em dinheiro após o calculo final do preço, dar desconto de XX%.
	 */
	public void pagtoDinheiro(Produto p) throws PrecoZeradoException {
		double precofinal = p.getPreco()*95/100;
		p.setPreco(precofinal);
	}
	
	/**
	 * No pagamento em dinheiro após o calculo final do preço, acrescer XX% no valor do preço.
	 */
	public void pagtoCartao(Produto p) throws PrecoZeradoException {
		double precofinal = p.getPreco()*98/100;
		p.setPreco(precofinal);
	}

}
