/**
 * 
 */
package br.pe.unit.quesito11;

/**
 * @author Andre
 *
 */
public class Candidato extends Pessoa {

	private int candidatoId;
	private String cargo;
	private String partido;
	private boolean resultado;
	private String uf;
	private Partido partidoObj;
	private Votar votar;

	public int getCandidatoId() {
		return candidatoId;
	}

	public void setCandidatoId(int candidatoId) {
		this.candidatoId = candidatoId;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getPartido() {
		return partido;
	}

	public void setPartido(String partido) {
		this.partido = partido;
	}

	public boolean isResultado() {
		return resultado;
	}

	public void setResultado(boolean resultado) {
		this.resultado = resultado;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public Partido getPartidoObj() {
		return partidoObj;
	}

	public void setPartidoObj(Partido partidoObj) {
		this.partidoObj = partidoObj;
	}

	public Votar getVotar() {
		return votar;
	}

	public void setVotar(Votar votar) {
		this.votar = votar;
	}

	/**
	 * imprimir o nome da classe e do método
	 */

	public int candidatura() {
		System.out.println("Classe:" + getClass().getSimpleName());
		System.out.println("Método: candidatura");
		return 0;
	}

}
