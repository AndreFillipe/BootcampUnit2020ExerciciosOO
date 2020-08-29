/**
 * 
 */
package br.pe.unit.quesito3;

/**
 * @author Andre
 *
 */
public class Terrestre extends MeioDeTransporte {
	private int qtdeRodas;
	private double potencia;

	public int getQtdeRodas() {
		return qtdeRodas;
	}

	public void setQtdeRodas(int qtdeRodas) {
		this.qtdeRodas = qtdeRodas;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	/**
	 * return a potência do motor X carga máxima (kg) X 100
	 */
	@Override
	public double consumo() {
		return this.potencia * super.getCarga_maxima() * 100;
	}

}
