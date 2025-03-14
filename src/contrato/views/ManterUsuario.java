/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contrato.views;

import contrato.controllers.ControllerUsuario;
import contrato.model.dados.Usuario;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author LAB_211
 */
public class ManterUsuario implements ContratoInteface {

    @Override
    public void menu() {
        String msg = "Entre com a opção \n";
        msg += "0. Fim \n";
        msg += "1. Inserir \n";
        msg += "2. Alterar \n";
        msg += "3. Excluir \n";
        msg += "4. Listar \n";
        msg += "5. Buscar ";
        int opcao = Integer.parseInt(JOptionPane.showInputDialog(msg));
    
        switch(opcao){
            case 1 -> inserir();
            case 2 -> alterar();
            case 3 -> excluir();
            case 4 -> listar();
            case 5 -> buscar();
            default -> System.out.println("Opção inválida.");
        }
    }

    @Override
    public void inserir() {
        System.out.println("Opção inserir");
        String login = JOptionPane.showInputDialog("Login");
        String senha = JOptionPane.showInputDialog("Senha");
        String status = JOptionPane.showInputDialog("Status");
        String tipo = JOptionPane.showInputDialog("Tipo");
        Usuario usuEnt = new Usuario(login, senha, status, tipo);
        ControllerUsuario contUsu = new ControllerUsuario();
        Usuario usuSaida = (Usuario) contUsu.Inserir(usuEnt);
        JOptionPane.showMessageDialog(null, usuSaida);
    }

    @Override
    public void alterar() {
        System.out.println("Opção alterar");
        int id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        String login = JOptionPane.showInputDialog("Login");
        String senha = JOptionPane.showInputDialog("Senha");
        String status = JOptionPane.showInputDialog("Status");
        String tipo = JOptionPane.showInputDialog("Tipo");
        Usuario usuEnt = new Usuario(id, login, senha, status, tipo);
        ControllerUsuario contUsu = new ControllerUsuario();
        Usuario usuSaida = (Usuario) contUsu.Alterar(usuEnt);
        JOptionPane.showMessageDialog(null, usuSaida);
    }

    @Override
    public void excluir() {
        System.out.println("Opção excluir");
        int id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        ControllerUsuario contUsu = new ControllerUsuario();
        Boolean retorno = contUsu.Excluir(id);
        JOptionPane.showMessageDialog(null, retorno);
    }

    @Override
    public void buscar() {
        System.out.println("Opção buscar");
        int id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        ControllerUsuario contUsu = new ControllerUsuario();
        Usuario usuSaida = (Usuario) contUsu.Buscar(id);
        JOptionPane.showMessageDialog(null, usuSaida);
    }
    
    public boolean validar () {
        boolean retorno = false;
        String login = JOptionPane.showInputDialog("Login");
        String senha = JOptionPane.showInputDialog("Senha");
        Usuario usu = new Usuario(login,senha);
        retorno = true;
        return retorno;
    }

    @Override
    public void listar() {
        System.out.println("Opção listar");
        String login = JOptionPane.showInputDialog("Login");
        Usuario usuEnt = new Usuario(login);
        ControllerUsuario contUsu = new ControllerUsuario();
        List<Object> listaSaida1 = contUsu.Listar(login);
        List<Object> listaSaida2 = contUsu.Listar(usuEnt);

        for (Object obj1 : listaSaida1) {
            JOptionPane.showMessageDialog(null, obj1);
        }

        for (Object obj2 : listaSaida2) {
            JOptionPane.showMessageDialog(null, obj2);
        }

    }
    
}
