/**
 * 
 */
package br.pe.unit.quesito8;

import java.util.ArrayList;

import br.pe.unit.quesito1.Transporte;

/**
 * @author Andre
 *
 */
public class DadosImpl implements Dados {
	
	private ArrayList<Transporte> lista = new ArrayList();

	@Override
	public void adicionar(Transporte t) throws Exception {
		lista.add(t);
	}

	@Override
	public void excluir(Transporte t) {
		lista.remove(t);
	}
}