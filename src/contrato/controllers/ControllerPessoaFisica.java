package contrato.controllers;

import java.util.List;

import contrato.model.daos.DaoPessoaFisica;

public class ControllerPessoaFisica implements ContratoControllers{

    DaoPessoaFisica daoPessoaFisica;

    @Override
    public Object Buscar(int id) {
        daoPessoaFisica = new DaoPessoaFisica();
        return daoPessoaFisica.Buscar(id);
    }

    @Override
    public Object Inserir(Object obj) {
        daoPessoaFisica = new DaoPessoaFisica();
        return daoPessoaFisica.Inserir(obj);
    }

    @Override
    public Object Alterar(Object obj) {
        daoPessoaFisica = new DaoPessoaFisica();
        return daoPessoaFisica.Alterar(obj);
    }

    @Override
    public Boolean Excluir(int id) {
         daoPessoaFisica = new DaoPessoaFisica();
         return daoPessoaFisica.Excluir(id);
    }

    @Override
    public List<Object> Listar(Object obj) {
        daoPessoaFisica = new DaoPessoaFisica();
        return    daoPessoaFisica.Listar(obj);
    }

    @Override
    public List<Object> Listar(String param) {
        daoPessoaFisica = new DaoPessoaFisica();
        return daoPessoaFisica.Listar(param);
    }

}