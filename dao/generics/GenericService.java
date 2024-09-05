package br.com.cpardin.dao.generics;

import java.io.Serializable;
import java.util.Collection;


import br.com.cpardin.exceptions.TipoChaveNaoEncontradaException;


public abstract class GenericService<T, E extends Serializable>
        implements IGenericService<T, E> {

    protected IGenericDAO<T,E> dao;

    public GenericService(IGenericDAO<T,E> dao) {
        this.dao = dao;
    }

    @Override
    public Boolean cadastrar(T entity) throws TipoChaveNaoEncontradaException {
        return this.dao.cadastrar(entity);
    }

    @Override
    public void excluir(E valor) {
        this.dao.excluir((Long) valor);
    }

    @Override
    public void alterar(T entity) throws TipoChaveNaoEncontradaException {
        this.dao.alterar(entity);
    }

    @Override
    public T consultar(E valor) {
        return this.dao.consultar((Long) valor);
    }

    @Override
    public Collection<T> buscarTodos() {
        return this.dao.buscarTodos();
    }

}