package br.com.cpardin.dao.generics;

import java.io.Serializable;
import java.util.Collection;


import br.com.cpardin.exceptions.TipoChaveNaoEncontradaException;


public interface IGenericService <T, E extends Serializable> {


    public Boolean cadastrar(T entity) throws TipoChaveNaoEncontradaException;


    public void excluir(E valor);


    public void alterar(T entity) throws TipoChaveNaoEncontradaException;


    public T consultar(E valor);


    public Collection<T> buscarTodos();

}