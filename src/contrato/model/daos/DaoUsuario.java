/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contrato.model.daos;

import contrato.model.dados.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LAB_211
 */
public class DaoUsuario implements ContratoDaos {

    @Override
    public Object Buscar(int id) {
        System.out.println("Usuario = " + id);
        Usuario usu = new Usuario(id);
        return usu;
    }

    @Override
    public Object Inserir(Object obj) {
        Usuario usu = (Usuario) obj;
        System.out.println("Usuario = " + obj.toString());
        usu.setId(100);
        usu.setStatus("ATIVO");
        usu.setTipo("ADM");
        return usu;
    }

    @Override
    public Object Alterar(Object obj) {
        System.out.println("Usuario = " + obj.toString());
        return obj;
    }

    @Override
    public Boolean Excluir(int id) {
       System.out.println("Usuario = " + id);
       return true;
    }

    @Override
    public List<Object> Listar(Object obj) {
        List<Object> listaUsuario = new ArrayList<>();
        listaUsuario.add(obj);
        return listaUsuario;
    }

    @Override
    public List<Object> Listar(String param) {
        List<Object> listaUsuario = new ArrayList<>();
        Usuario usu = new Usuario(param);
        Usuario usu1 = new Usuario("xxx");
        Usuario usu2 = new Usuario("lll");

        listaUsuario.add(usu);
        listaUsuario.add(usu1);
        listaUsuario.add(usu2);

        return listaUsuario;
    }
    
}
