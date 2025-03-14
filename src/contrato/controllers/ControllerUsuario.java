/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contrato.controllers;

import contrato.model.daos.DaoUsuario;
import java.util.List;

/**
 *
 * @author LAB_211
 */
public class ControllerUsuario implements ContratoControllers {

    DaoUsuario daoUsu;

    @Override
    public Object Buscar(int id) {
        daoUsu = new DaoUsuario();
        return daoUsu.Buscar(id);
    }

    @Override
    public Object Inserir(Object obj) {
        daoUsu = new DaoUsuario();
        return daoUsu.Inserir(obj);
    }

    @Override
    public Object Alterar(Object obj) {
        daoUsu = new DaoUsuario();
        return daoUsu.Alterar(obj);
    }
        
    @Override
    public Boolean Excluir(int id) {
        daoUsu = new DaoUsuario();
        return daoUsu.Excluir(id);
    }

    @Override
    public List<Object> Listar(Object obj) {
        daoUsu = new DaoUsuario();
        return daoUsu.Listar(obj);
    }

    @Override
    public List<Object> Listar(String param) {
        daoUsu = new DaoUsuario();
        return daoUsu.Listar(param);
    }
    
}
