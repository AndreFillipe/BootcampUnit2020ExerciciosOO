/**
 * 
 */
package br.pe.unit.quesito10;

import java.sql.Connection;

/**
 * @author Andre
 *
 */
public class ConexaoImpl implements Conexao {

	private String usuario;
	private String senha;
	private String url;

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * imprimir o nome da classe
	 */
	public void imprimirNomeClasse() {
		
		System.out.println("Classe:" +getClass().getSimpleName());
	}

	/**
	 * imprimir nome da classe e do método
	 */
	@Override
	public Connection conectar() {
		imprimirNomeClasse();
		System.out.println("Nome do método: conectar");
		return null;
	}

	/**
	 * imprimir nome da classe e do método
	 */
	@Override
	public void desconectar(Connection con) {
		imprimirNomeClasse();
		System.out.println("Nome do método: desconectar");
	}
}
