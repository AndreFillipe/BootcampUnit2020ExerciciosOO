/**
 * 
 */
package br.pe.unit.quesito10;

import java.sql.Connection;

/**
 * @author Andre
 *
 */
public interface Conexao {

	public Connection conectar();
	public void desconectar(Connection con);
}
