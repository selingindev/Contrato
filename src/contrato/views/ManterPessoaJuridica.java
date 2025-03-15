package contrato.views;

import javax.swing.JOptionPane;

import contrato.controllers.ControllerPessoaFisica;
import contrato.model.dados.PessoaJuridica;

public class ManterPessoaJuridica implements ContratoInteface{

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
      String nome =  JOptionPane.showInputDialog("Nome");
      String cnpj = JOptionPane.showInputDialog("cnpj");
      int id = Integer.parseInt(JOptionPane.showInputDialog("id"));
        
      ControllerPessoaFisica cPessoaFisica = new ControllerPessoaFisica();
      PessoaJuridica entradaPF =  new PessoaJuridica(id, nome, cnpj);
      PessoaJuridica saidaPF = (PessoaJuridica) cPessoaFisica.Inserir(entradaPF);
      JOptionPane.showMessageDialog(null, saidaPF);
    }

    @Override
    public void alterar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'alterar'");
    }

    @Override
    public void excluir() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'excluir'");
    }

    @Override
    public void listar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listar'");
    }

    @Override
    public void buscar() {
     
        
    }

    
}