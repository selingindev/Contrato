package contrato.views;

import javax.swing.JOptionPane;

import contrato.controllers.ControllerPessoaFisica;
import contrato.model.dados.PessoaFisica;

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
        System.out.println("Opção Alterar");
        String nome = JOptionPane.showInputDialog("NOME");
        String cpf = JOptionPane.showInputDialog("CPF");
        int id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        ControllerPessoaFisica cPessoaFisica = new ControllerPessoaFisica();
        PessoaFisica entradaPessoaFisica = new PessoaFisica(id, nome, cpf);
        PessoaFisica saidaPessoaFisica = (PessoaFisica) cPessoaFisica.Alterar(entradaPessoaFisica);
        JOptionPane.showMessageDialog(null, saidaPessoaFisica);

    }

    @Override
    public void buscar() {
        System.out.println("Opção Buscar");
        int id = Integer.parseInt(JOptionPane.showInputDialog(null, "ID"));
        ControllerPessoaFisica cPessoaFisica = new ControllerPessoaFisica();
        PessoaFisica saidaPessoaFisica =  (PessoaFisica) cPessoaFisica.Buscar(id);
        JOptionPane.showMessageDialog(null, saidaPessoaFisica);
        
    }

    @Override
    public void excluir() {
        System.out.println("Opção Excluir");
        int id = Integer.parseInt(JOptionPane.showInputDialog(null, "ID"));
        ControllerPessoaFisica cPessoaFisica = new ControllerPessoaFisica();
        Boolean saidaPessoaFisica = cPessoaFisica.Excluir(id);
        JOptionPane.showMessageDialog(null, saidaPessoaFisica);
    }

    @Override
    public void inserir() {
        System.out.println("Opção Inserir");
        ControllerPessoaFisica cPessoaFisica = new ControllerPessoaFisica();
        
        String nome = JOptionPane.showInputDialog(null, "Nome");
        String cpf = JOptionPane.showInputDialog(null, "CPF");
        int id = Integer.parseInt(JOptionPane.showInputDialog(null, "ID")); 

        PessoaFisica entradaPessoaFisica = new PessoaFisica(id, nome, cpf);
        PessoaFisica saidaPessoaFisica = (PessoaFisica) cPessoaFisica.Inserir(entradaPessoaFisica);
        JOptionPane.showMessageDialog(null, saidaPessoaFisica);
        
    }

    @Override
    public void listar() {
        System.out.println("Opção listar");
        // TODO Auto-generated method stub
        
    }

}