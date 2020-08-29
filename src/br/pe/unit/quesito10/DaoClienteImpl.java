package br.pe.unit.quesito10;

import java.util.ArrayList;

public class DaoClienteImpl implements DaoCliente {

	private ArrayList<Cliente> lista;
	private ConexaoImpl conexao;

	/**
	 * imprimir o nome da classe
	 */
	public void imprimirNomeClasse() {

		System.out.println("Classe:" + getClass().getSimpleName());
	}

	/**
	 * imprimir nome da classe e do m�todo
	 */
	@Override
	public Cliente incluir(Cliente cliente) {
		imprimirNomeClasse();
		System.out.println("Nome do m�todo: incluir");
		return null;
	}

	/**
	 * imprimir nome da classe e do m�todo
	 */
	@Override
	public void excluir(Integer codigo) {
		imprimirNomeClasse();
		System.out.println("Nome do m�todo: excluir");
	}

	/**
	 * imprimir nome da classe e do m�todo
	 */
	@Override
	public Cliente alterar(Cliente cliente) {
		imprimirNomeClasse();
		System.out.println("Nome do m�todo: alterar");
		return null;
	}

	/**
	 * imprimir nome da classe e do m�todo
	 */
	@Override
	public ArrayList<Cliente> listar() {
		imprimirNomeClasse();
		System.out.println("Nome do m�todo: listar");
		return null;
	}

	/**
	 * imprimir nome da classe e do m�todo
	 */
	@Override
	public Cliente get() {
		imprimirNomeClasse();
		System.out.println("Nome do m�todo: get");
		return null;
	}

	public ArrayList<Cliente> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Cliente> lista) {
		this.lista = lista;
	}

	public ConexaoImpl getConexao() {
		return conexao;
	}

	public void setConexao(ConexaoImpl conexao) {
		this.conexao = conexao;
	}
}
