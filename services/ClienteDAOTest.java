package br.com.cpardin.services;

import br.com.cpardin.dao.ClienteDAO;
import br.com.cpardin.exceptions.TipoChaveNaoEncontradaException;
import br.com.cpardin.dao.ClienteDaoMock;
import br.com.cpardin.dao.IClienteDAO;
import br.com.cpardin.domain.Cliente;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClienteDAOTest {

    private IClienteDAO clienteDao;

    private Cliente cliente;

    public ClienteDAOTest () {
        clienteDao = new ClienteDaoMock();
    }

    @Before
    public void init() throws TipoChaveNaoEncontradaException {
        cliente = new Cliente();
        cliente.setCpf(12312312312L);
        cliente.setNome("Caio");
        cliente.setCidade("São Paulo");
        cliente.setEnd("end");
        cliente.setNumero(10);
        cliente.setEstado("SP");
        cliente.setTel(11940097411L);


        clienteDao.cadastrar(cliente);



    }

    @Test
    public void pesquisarCliente() {

        Cliente clienteConsultado = clienteDao.consultar(cliente.getCpf());
        Assert.assertNotNull(clienteConsultado);
    }
    public void salvarCliente() throws TipoChaveNaoEncontradaException {
        Boolean retorno = clienteDao.cadastrar(cliente);
    }

    @Test
    public void excluirCliente() {
        clienteDao.excluir(cliente.getCpf());
    }

    public void alterarCliente() throws TipoChaveNaoEncontradaException {
        cliente.setNome("Caio Pardin");
        clienteDao.alterar(cliente);

        Assert.assertEquals("Caio Pardin", cliente.getNome());
    }
}
