/**
 * 
 */
package br.pe.unit.quesito11;

/**
 * @author Andre
 *
 */
public class Eleitor extends Pessoa {

	private String endereco;
	private int eleitorID;
	private ZonaEleitoral zona;
	private Votar voto;

	public Votar getVoto() {
		return voto;
	}

	public void setVoto(Votar voto) {
		this.voto = voto;
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
