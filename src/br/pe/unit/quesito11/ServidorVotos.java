/**
 * 
 */
package br.pe.unit.quesito11;

import java.util.ArrayList;
import java.util.Calendar;

/**
 * @author Andre
 *
 */
public class ServidorVotos {

	private int candidatoID;
	private int eleitorID;
	private Calendar data;
	private int contaVotos;
	private ArrayList<Resultado> resultados;

	public int getCandidatoID() {
		return candidatoID;
	}

	public void setCandidatoID(int candidatoID) {
		this.candidatoID = candidatoID;
	}

	public int getEleitorID() {
		return eleitorID;
	}

	public void setEleitorID(int eleitorID) {
		this.eleitorID = eleitorID;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	public int getContaVotos() {
		return contaVotos;
	}

	public void setContaVotos(int contaVotos) {
		this.contaVotos = contaVotos;
	}

	public ArrayList<Resultado> getResultados() {
		return resultados;
	}

	public void setResultados(ArrayList<Resultado> resultados) {
		this.resultados = resultados;
	}
	
	public int contaVotos() {
		System.out.println("Classe:" + getClass().getSimpleName());
		System.out.println("Método: contaVotos");
		return this.getContaVotos();
	}
}