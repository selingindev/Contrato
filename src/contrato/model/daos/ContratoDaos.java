/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package contrato.model.daos;

import java.util.List;

/**
 *
 * @author LAB_211
 */
public interface ContratoDaos {
    
    public Object Buscar (int id);
    public Object Inserir (Object obj);
    public Object Alterar (Object obj);
    public Boolean Excluir (int id);
    public List<Object> Listar (Object obj);
    public List<Object> Listar (String param);

    
}
