package contrato.views;

import javax.swing.JOptionPane;

public class ManterPessoaFisica implements ContratoInteface {

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
    public void alterar() {
        
        
    }

    @Override
    public void buscar() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void excluir() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void inserir() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void listar() {
        // TODO Auto-generated method stub
        
    }

}