/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contrato.controllers;

import java.util.List;

/**
 *
 * @author LAB_211
 */
public interface ContratoControllers {
    
    public Object Buscar (int id);
    public Object Inserir (Object obj);
    public Object Alterar (Object obj);
    public Boolean Excluir (int id);
    public List<Object> Listar (Object obj);
    public List<Object> Listar (String param);

}
