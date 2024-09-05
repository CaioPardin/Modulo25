package br.com.cpardin.services;

import br.com.cpardin.dao.IProdutoDAO;
import br.com.cpardin.dao.generics.GenericService;
import br.com.cpardin.domain.Produto;




public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

    public ProdutoService(IProdutoDAO dao) {
        super(dao);
    }

}