package br.com.cpardin.dao;

import br.com.cpardin.dao.generics.IGenericDAO;
import br.com.cpardin.domain.Cliente;

import java.io.Serializable;

public interface IClienteDAO extends IGenericDAO<Cliente, Serializable> {
   // Boolean salvar(Cliente cliente);

   // Cliente buscarPorCPF(Long cpf);

   //void excluir(Long cpf);

   // void alterar(Cliente cliente);
}
