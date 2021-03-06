/**
 * 
 */
package br.pe.unit.quesito1;

/**
 * @author Andre
 *
 */
public class Transporte {

	private Integer id;
	private Integer ano;
	private String modelo;
	private Double carga_maxima;
	private Double potencia;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Double getCarga_maxima() {
		return carga_maxima;
	}

	public void setCarga_maxima(Double carga_maxima) {
		this.carga_maxima = carga_maxima;
	}

	public Double getPotencia() {
		return potencia;
	}

	public void setPotencia(Double potencia) {
		this.potencia = potencia;
	}

	/**
	 * 
	 * @return a pot�ncia do motor X carga m�xima (kg) X 100
	 */
	public Double consumo() {
		return  this.getPotencia() * this.getCarga_maxima() * 100;
	}
	public String leiaModelo() {
		return this.getModelo();
	}

	public Transporte(Integer id, Integer ano, String modelo, Double carga_maxima, Double potencia) {
		this.id = id;
		this.ano = ano;
		this.modelo = modelo;
		this.carga_maxima = carga_maxima;
		this.potencia = potencia;
	}
	public Transporte() {
		
	}
	
}