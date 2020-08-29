/**
 * 
 */
package br.pe.unit.quesito11;

import java.util.ArrayList;

/**
 * @author Andre
 *
 */
public class ZonaEleitoral {

	private String endereco;
	private String CEP;
	private ArrayList<Eleitor> eleitores;

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCEP() {
		return CEP;
	}

	public void setCEP(String cEP) {
		CEP = cEP;
	}

	public ArrayList<Eleitor> getEleitores() {
		return eleitores;
	}

	public void setEleitores(ArrayList<Eleitor> eleitores) {
		this.eleitores = eleitores;
	}

}
