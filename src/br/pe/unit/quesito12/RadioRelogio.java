/**
 * 
 */
package br.pe.unit.quesito12;

/**
 * @author Andre
 *
 */
public class RadioRelogio implements Radio,Relogio {

	private String marca;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	/**
	 * imprimir o nome da classe
	 */
	public void imprimirNomeClasse() {
		
		System.out.println("Classe:" +getClass().getSimpleName());
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

	/**
	 * imprimir o nome da classe e do método
	 */
	@Override
	public void mudarEstacao() {
		imprimirNomeClasse();
		System.out.println("Método: mudarEstacao");
	}

	/**
	 * imprimir o nome da classe e do método
	 */
	@Override
	public void tocar() {
		imprimirNomeClasse();
		System.out.println("Método: tocar");
	}
}
