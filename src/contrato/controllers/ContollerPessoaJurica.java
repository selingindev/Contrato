package contrato.controllers;

import java.util.List;

import contrato.model.daos.DaoPessoaFisica;

public class ContollerPessoaJurica implements ContratoControllers {
    DaoPessoaFisica dPessoaFisica;

    @Override
    public Object Buscar(int id) {
        dPessoaFisica = new DaoPessoaFisica();
        return dPessoaFisica.Buscar(id);
    }

    @Override
    public Object Inserir(Object obj) {
        dPessoaFisica = new DaoPessoaFisica();
        return dPessoaFisica.Inserir(obj);
    }

    @Override
    public Object Alterar(Object obj) {
        dPessoaFisica = new DaoPessoaFisica();
        return dPessoaFisica.Alterar(obj);
    }

    @Override
    public Boolean Excluir(int id) {
        dPessoaFisica = new DaoPessoaFisica();
        return dPessoaFisica.Excluir(id);
    }

    @Override
    public List<Object> Listar(Object obj) {
        dPessoaFisica = new DaoPessoaFisica();
        return dPessoaFisica.Listar(obj);
    }

    @Override
    public List<Object> Listar(String param) {
        dPessoaFisica = new DaoPessoaFisica();
        return dPessoaFisica.Listar(param);
    
    }
    
}
