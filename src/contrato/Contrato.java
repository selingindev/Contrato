/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contrato;

import contrato.views.ManterPessoaFisica;
import contrato.views.ManterPessoaJuridica;
import contrato.views.ManterUsuario;
import javax.swing.JOptionPane;

/**
 *
 * @author LAB_211
 */
public class Contrato {

    /**
     * @param args the command line arguments
     */
     static ManterUsuario mu = new ManterUsuario();
     static ManterPessoaFisica mpf = new ManterPessoaFisica();
     static ManterPessoaJuridica mpj = new ManterPessoaJuridica();
 
    public static void main(String[] args) {
        if(mu.validar()) {
            menu();
        } else {
            JOptionPane.showMessageDialog(null, "Usuario Invalido");
        }
       // TODO code application logic here
    }
    
    
    public static void menu() {
        String msg = "Entre com a opção \n";
        msg += "0. Fim \n";
        msg += "1. Usuario \n";
        msg += "2. Pessoa Fisica \n";
        msg += "3. Pessoa Juridica \n";
        int opcao = Integer.parseInt(JOptionPane.showInputDialog(msg));
    
        switch(opcao){
            case 1 -> mu.menu();
            case 2 -> mpf.menu();
            case 3 -> mpj.menu();
            default -> System.out.println("Opção inválida.");
        }
    }

    
    
}
