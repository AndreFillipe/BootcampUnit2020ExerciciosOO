/**
 * 
 */
package br.pe.unit.quesito5;

import java.util.ArrayList;

/**
 * @author Andre
 *
 */
public class Turma {

	private String cod;
	private Integer turno;
	private Integer sala;
	private ArrayList<Aluno> alunos;

	public String getCod() {
		return cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}

	public Integer getTurno() {
		return turno;
	}

	public void setTurno(Integer turno) {
		this.turno = turno;
	}

	public Integer getSala() {
		return sala;
	}

	public void setSala(Integer sala) {
		this.sala = sala;
	}

	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(ArrayList<Aluno> alunos) {
		this.alunos = alunos;
	}
}
