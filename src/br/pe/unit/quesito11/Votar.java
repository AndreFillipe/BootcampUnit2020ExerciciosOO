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
public class Votar {

	private int candidatoId;
	private int eleitorId;
	private Calendar data;
	private String cargoCandidato;
	private ArrayList<Eleitor> eleitores;
	private Candidato candidato;
	private ServidorVotos servidorVotos;

	public ArrayList<Eleitor> getEleitores() {
		return eleitores;
	}

	public void setEleitores(ArrayList<Eleitor> eleitores) {
		this.eleitores = eleitores;
	}

	public int getCandidatoId() {
		return candidatoId;
	}

	public void setCandidatoId(int candidatoId) {
		this.candidatoId = candidatoId;
	}

	public int getEleitorId() {
		return eleitorId;
	}

	public void setEleitorId(int eleitorId) {
		this.eleitorId = eleitorId;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	public String getCargoCandidato() {
		return cargoCandidato;
	}

	public void setCargoCandidato(String cargoCandidato) {
		this.cargoCandidato = cargoCandidato;
	}

	
	public Candidato getCandidato() {
		return candidato;
	}

	public void setCandidato(Candidato candidato) {
		this.candidato = candidato;
	}

	/**
	 * imprimir o nome da classe
	 */
	public void imprimirNomeClasse() {

		System.out.println("Classe:" + getClass().getSimpleName());
	}
	
	/**
	 * imprimir nome da classe e do método
	 */
	public void votar() {
		imprimirNomeClasse();
		System.out.println("Método: votar");
	}

	/**
	 * imprimir nome da classe e do método
	 */
	public void cancelar() {
		imprimirNomeClasse();
		System.out.println("Método: cancelar");
	}

	public ServidorVotos getServidorVotos() {
		return servidorVotos;
	}

	public void setServidorVotos(ServidorVotos servidorVotos) {
		this.servidorVotos = servidorVotos;
	}
	
}
