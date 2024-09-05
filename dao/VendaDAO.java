package br.com.cpardin.dao;

import br.com.cpardin.dao.generics.GenericDAO;
import br.com.cpardin.dao.generics.IVendaDAO;
import br.com.cpardin.domain.Venda;
import br.com.cpardin.domain.Venda.Status;
import br.com.cpardin.exceptions.TipoChaveNaoEncontradaException;


public class VendaDAO extends GenericDAO<Venda, String> implements IVendaDAO {

    @Override
    public Class<Venda> getTipoClasse() {
        return Venda.class;
    }

    @Override
    public void atualiarDados(Venda entity, Venda entityCadastrado) {
        entityCadastrado.setCodigo(entity.getCodigo());
        entityCadastrado.setStatus(entity.getStatus());
    }

    @Override
    public void excluir(String valor) {
        throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
    }

    @Override
    public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException {
        venda.setStatus(Status.CONCLUIDA);
        super.alterar(venda);
    }



}
