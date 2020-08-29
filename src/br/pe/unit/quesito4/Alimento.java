/**
 * 
 */
package br.pe.unit.quesito4;

/**
 * @author Andre
 *
 */
public class Alimento extends ItemDeLoja {

	private Integer selo;

	public Integer getSelo() {
		return selo;
	}

	public void setSelo(Integer selo) {
		this.selo = selo;
	}
	
	/**
	 * return o selo
	 */
	@Override
	public int getIdentificador() {
		return this.getSelo();
	}
}
