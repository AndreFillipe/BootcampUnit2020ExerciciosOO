/**
 * 
 */
package br.pe.unit.quesito12;

/**
 * @author Andre
 *
 */
public class RelogioImpl implements Relogio {

	private String marca;
	private String tipo;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * imprimir o nome da classe
	 */
	public void imprimirNomeClasse() {

		System.out.println("Classe:" + getClass().getSimpleName());
	}

	/**
	 * imprimir o nome da classe e do método
	 */
	@Override
	public void ajustarHora() {
		imprimirNomeClasse();
		System.out.println("Método: ajustarHora");
	}

	/**
	 * imprimir o nome da classe e do método
	 */
	@Override
	public void ajustarAlarme() {
		imprimirNomeClasse();
		System.out.println("Método: ajustarAlarme");
	}
}
