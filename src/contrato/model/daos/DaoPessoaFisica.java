/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contrato.model.daos;

import java.util.List;
import contrato.model.dados.PessoaFisica;

/**
 *
 * @author LAB_211
 */
public class DaoPessoaFisica implements ContratoDaos {

    PessoaFisica pf;

    @Override
    public Object Buscar(int id) {
        System.out.println("Pessoa: " + id);
        pf = new PessoaFisica(id);
        return pf;
    }

    @Override
    public Object Inserir(Object obj) {
       pf = (PessoaFisica) obj;
        System.out.println("Pessoa = " + obj.toString());
        pf.setId(100);
        return pf;
    }

    @Override
    public Object Alterar(Object obj) {
        pf = (PessoaFisica) obj;
        System.out.println("Pessoa = " + obj.toString());  
        return pf;
    }

    @Override
    public Boolean Excluir(int id) {
        pf = new PessoaFisica(id);
        System.out.println("Pessoa = " + id);
        return true;
    }

    @Override
    public List<Object> Listar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Object> Listar(String param) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
}
