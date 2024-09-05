package br.com.cpardin.dao.generics;

import br.com.cpardin.dao.generics.IGenericDAO;
import br.com.cpardin.domain.Venda;
import br.com.cpardin.exceptions.TipoChaveNaoEncontradaException;


public interface IVendaDAO extends IGenericDAO<Venda, String> {

    void excluir(String valor);

    public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException;
}