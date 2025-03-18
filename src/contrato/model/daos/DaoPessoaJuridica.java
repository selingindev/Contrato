package contrato.model.daos;

import java.util.List;
;
import contrato.model.dados.PessoaJuridica;

public class DaoPessoaJuridica implements ContratoDaos {

    PessoaJuridica pj;

    @Override
    public Object Buscar(int id) {
        System.out.println("Pessoa: " + id);
        pj = new PessoaJuridica(id);
        return pj;
    }

    @Override
    public Object Inserir(Object obj) {
       pj = (PessoaJuridica) obj;
        System.out.println("Pessoa = " + obj.toString());
        pj.setId(100);
        return pj;
    }

    @Override
    public Object Alterar(Object obj) {
        pj = (PessoaJuridica) obj;
        System.out.println("Pessoa = " + obj.toString());  
        return pj;
    }

    @Override
    public Boolean Excluir(int id) {
        pj = new PessoaJuridica(id);
        System.out.println("Pessoa = " + id);
        return true;
    }

    @Override
    public List<Object> Listar(Object obj) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Listar'");
    }

    @Override
    public List<Object> Listar(String param) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Listar'");
    }

    
}