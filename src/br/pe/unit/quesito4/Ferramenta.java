/**
 * 
 */
package br.pe.unit.quesito4;

/**
 * @author Andre
 *
 */
public class Ferramenta extends ItemDeLoja {

	private String categoria;
	private Integer serial;

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Integer getSerial() {
		return serial;
	}

	public void setSerial(Integer serial) {
		this.serial = serial;
	}

	/**
	 * return o serial
	 */
	@Override
	public int getIdentificador() {
		return this.getSerial();
	}

	/**
	 * Registra a categoria "padr�o"
	 */
	public void separar() {
		setCategoria("Outros");
	}

	/**
	 * Registra a categoria com o valor passado
	 * @param valor
	 */
	public void separar(String valor) {
		setCategoria(valor);
	}
}
