package br.com.cpardin;

import br.com.cpardin.dao.ClienteDaoMock;
import br.com.cpardin.dao.IClienteDAO;
import br.com.cpardin.services.ClienteService;
import br.com.cpardin.services.IClienteService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import br.com.cpardin.domain.Cliente;
import br.com.cpardin.exceptions.TipoChaveNaoEncontradaException;

public class ClienteServiceTest {

    private IClienteService clienteService;

    private Cliente cliente;

    public ClienteServiceTest() {
        IClienteDAO dao = new ClienteDaoMock();
        clienteService = new ClienteService(dao);
    }

    @Before
    public void init()  {
        cliente = new Cliente();
        cliente.setCpf(12312312312L);
        cliente.setNome("Caio");
        cliente.setCidade("São Paulo");
        cliente.setEnd("end");
        cliente.setNumero(10);
        cliente.setEstado("SP");
        cliente.setTel(11940097411L);


    }

    @Test
    public void pesquisarCliente() {


        Cliente clienteConsultado = clienteService.buscarPorCPF(cliente.getCpf());

        Assert.assertNotNull(clienteConsultado);
    }

    @Test
    public void salvarCliente() throws TipoChaveNaoEncontradaException {
        Boolean retorno = clienteService.salvar(cliente);

        Assert.assertTrue(retorno);
    }

    @Test
    public void excluirCliente() {
        clienteService.excluir(cliente.getCpf());
    }

    @Test
    public void alterarCliente() throws TipoChaveNaoEncontradaException {
        cliente.setNome("Caio Pardin");
        clienteService.alterar(cliente);

        Assert.assertEquals("Caio Pardin", cliente.getNome());
    }
}
