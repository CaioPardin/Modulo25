package br.com.cpardin.services;

import br.com.cpardin.domain.Produto;



public interface IProdutoService extends IGenericService<Produto, String> {

    Produto consultar(String codigo);

    Boolean cadastrar(Produto produto);

    void excluir(String codigo);

    void alterar(Produto produto);
}
