package br.unincor.model;

import java.text.DecimalFormat;

/**
 * Implementar relacionamento de herança
 * com a classe "Produto"
 *
 */
public class Sanduiche extends Produto{
	
	private Boolean trio; //Define se adiciona batata e refrigerante - sem validação
	private Boolean dobroRecheio; //Define se terá o dobro de recheio - sem validação

	public Sanduiche(String nome, Double preco, Boolean trio, Boolean dobroRecheio) {
		super(nome, preco);
		this.trio = trio;
		this.dobroRecheio = dobroRecheio;
	}



	/** Criar getters e setters **/

	public Boolean getTrio() {
		return trio;
	}



	public void setTrio(Boolean trio) {
		this.trio = trio;
	}



	public Boolean getDobroRecheio() {
		return dobroRecheio;
	}



	public void setDobroRecheio(Boolean dobroRecheio) {
		this.dobroRecheio = dobroRecheio;
	}



	/** Implementar para mostrar os valores de todos os atributos **/
	public String verDados() {
		DecimalFormat df = new DecimalFormat("0.00"); //Formatando o preço com 2 casas decimais
		return "Nome: " + this.getNome() + 
				"\nPreço: R$ " + df.format(this.getPreco())+
				"\nTrio: " +this.getTrio()+
				"\nDobro de recheio:" + this.getDobroRecheio();
	}
	
}
