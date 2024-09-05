package br.com.cpardin.dao.generics;



import br.com.cpardin.exceptions.TipoChaveNaoEncontradaException;

import java.io.Serializable;
import java.util.Collection;


public interface IGenericDAO <T, E extends Serializable> {


    public Boolean cadastrar(T entity) throws TipoChaveNaoEncontradaException;


    public void excluir(Long valor);


    public void alterar(T entity) throws TipoChaveNaoEncontradaException;


    public T consultar(Long valor);


    public Collection<T> buscarTodos();
}