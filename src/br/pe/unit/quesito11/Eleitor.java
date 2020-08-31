/**
 * 
 */
package br.pe.unit.quesito11;

import java.util.ArrayList;

/**
 * @author Andre
 *
 */
public class Eleitor extends Pessoa {

	private String endereco;
	private int eleitorID;
	private ZonaEleitoral zona;
	private ArrayList<Votar> votos;

	public ArrayList<Votar> getVoto() {
		return this.votos;
	}

	public void setVoto(ArrayList<Votar> votos) {
		this.votos = votos;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getEleitorID() {
		return eleitorID;
	}

	public void setEleitorID(int eleitorID) {
		this.eleitorID = eleitorID;
	}
	
	
	public ZonaEleitoral getZona() {
		return zona;
	}

	public void setZona(ZonaEleitoral zona) {
		this.zona = zona;
	}

	/**
	 * imprimir o nome da classe e o nome do método
	 */
	public int validar() {
		System.out.println("Classe:" + getClass().getSimpleName());
		System.out.println("Método: validar");
		return 0;
	}
}
