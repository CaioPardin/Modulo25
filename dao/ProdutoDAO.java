package br.com.cpardin.dao;

import br.com.cpardin.dao.generics.GenericDAO;
import br.com.cpardin.domain.Produto;



public class ProdutoDAO extends GenericDAO<Produto, String> implements IProdutoDAO {

    public ProdutoDAO() {
        super();
    }

    @Override
    public Class<Produto> getTipoClasse() {
        return Produto.class;
    }

    @Override
    public void atualiarDados(Produto entity, Produto entityCadastrado) {
        entityCadastrado.setCodigo(entity.getCodigo());
        entityCadastrado.setDescricao(entity.getDescricao());
        entityCadastrado.setNome(entity.getNome());
        entityCadastrado.setValor(entity.getValor());
    }

    @Override
    public void excluir(String valor) {

    }

    @Override
    public Produto consultar(String valor) {
        return null;
    }
}