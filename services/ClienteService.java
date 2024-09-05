package br.com.cpardin.services;

import br.com.cpardin.dao.ClienteDAO;
import br.com.cpardin.dao.IClienteDAO;
import br.com.cpardin.domain.Cliente;
import br.com.cpardin.exceptions.TipoChaveNaoEncontradaException;

public class ClienteService implements IClienteService {

    private IClienteDAO clienteDAO;

    public ClienteService(IClienteDAO clienteDAO) {
        this.clienteDAO = clienteDAO;

    }

    public Boolean salvar(Cliente cliente) throws TipoChaveNaoEncontradaException {
        return clienteDAO.cadastrar(cliente);
    }

    public Cliente buscarPorCPF(Long cpf) {
        return clienteDAO.consultar(cpf);
    }

    @Override
    public void excluir(Long cpf) {
        clienteDAO.excluir(cpf);

    }@Override
    public void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException {
        clienteDAO.alterar(cliente);

    }
}
