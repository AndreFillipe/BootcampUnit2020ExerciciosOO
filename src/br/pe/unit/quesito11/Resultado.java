/**
 * 
 */
package br.pe.unit.quesito11;

import java.util.ArrayList;

/**
 * @author Andre
 *
 */
public class Resultado {

	private int candidatoID;
	private ArrayList<ServidorVotos> servidorVotos;

	public int getCandidatoID() {
		return candidatoID;
	}

	public void setCandidatoID(int candidatoID) {
		this.candidatoID = candidatoID;
	}

	public ArrayList<ServidorVotos> getServidorVotos() {
		return servidorVotos;
	}

	public void setServidorVotos(ArrayList<ServidorVotos> servidorVotos) {
		this.servidorVotos = servidorVotos;
	}

	/**
	 * imprimir o nome da classe e do método
	 */
	public int getTotalVotos() {
		System.out.println("Classe:" + getClass().getSimpleName());
		System.out.println("Método: getTotalVotos");
		return 0;
	}

	public void divulgarVencedor() {
		System.out.println("Classe:" + getClass().getSimpleName());
		System.out.println("Método: divulgarVencedor");

	}
}