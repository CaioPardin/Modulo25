package br.com.cpardin.dao;

import br.com.cpardin.dao.generics.GenericDAO;
import br.com.cpardin.domain.Cliente;

public class ClienteDAO extends GenericDAO<Cliente, Long> implements IClienteDAO {

    public ClienteDAO() {
        super();
    }


    @Override
    public Class<Cliente> getTipoClasse() {
        return Cliente.class;
    }

    @Override
    public void atualiarDados(Cliente entity, Cliente entityCadastrado) {

    }
}
