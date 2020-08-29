/**
 * 
 */
package br.pe.unit.quesito11;

import java.util.ArrayList;

/**
 * @author Andre
 *
 */
public class Partido {

	private String nome;
	private String sigla;
	private ArrayList<Candidato> candidatos;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public ArrayList<Candidato> getCandidatos() {
		return candidatos;
	}

	public void setCandidatos(ArrayList<Candidato> candidatos) {
		this.candidatos = candidatos;
	}
}
