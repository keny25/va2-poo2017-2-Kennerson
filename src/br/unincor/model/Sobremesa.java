package br.unincor.model;

import java.text.DecimalFormat;

/**
 * Implementar relacionamento de herança
 * com a classe "Produto"
 *
 */
public class Sobremesa extends Produto{
	
	private Boolean adicionais; //Define se adiciona mais alguns ingredientes - sem validação

	
	
	
	public Sobremesa(String nome, Double preco, Boolean adicionais) {
		super(nome, preco);
		this.adicionais = adicionais;
	}




	/** Criar um construtor que recebe todos os atributos como parâmetro **/

	/** Criar getters e setters **/

	public Boolean getAdicionais() {
		return adicionais;
	}




	public void setAdicionais(Boolean adicionais) {
		this.adicionais = adicionais;
	}




	/** Implementar para mostrar os valores de todos os atributos **/
	public String verDados() {
		DecimalFormat df = new DecimalFormat("0.00");
		return "Nome: " + this.getNome() + 
				"\nPreço: R$ " + df.format(this.getPreco())+
				"\nAdicionais:" + this.getAdicionais();
	}
}
