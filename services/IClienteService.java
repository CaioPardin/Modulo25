package br.com.cpardin.services;

import br.com.cpardin.domain.Cliente;
import br.com.cpardin.exceptions.TipoChaveNaoEncontradaException;

public interface IClienteService {
    Boolean salvar(Cliente cliente) throws TipoChaveNaoEncontradaException;

    Cliente buscarPorCPF(Long cpf);
    void excluir(Long cpf);

    void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;
}
