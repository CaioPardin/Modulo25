package br.com.cpardin.dao;

import br.com.cpardin.dao.generics.IGenericDAO;
import br.com.cpardin.domain.Produto;


public interface IProdutoDAO extends IGenericDAO<Produto, String>{

    void excluir(String valor);

    Produto consultar(String valor);
}