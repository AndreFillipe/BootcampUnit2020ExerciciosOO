/**
 * 
 */
package br.pe.unit.quesito10;

import java.util.ArrayList;

/**
 * @author Andre
 *
 */
public interface DaoCliente {

	public Cliente incluir(Cliente cliente);
	public void excluir(Integer codigo);
	public Cliente alterar(Cliente cliente);
	public ArrayList<Cliente> listar();
	public Cliente get();
}
