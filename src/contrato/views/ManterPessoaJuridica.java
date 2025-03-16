package contrato.views;

import javax.swing.JOptionPane;

import contrato.controllers.ControllerPessoaJuridica;
import contrato.model.dados.PessoaJuridica;

public class ManterPessoaJuridica implements ContratoInteface {

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

        switch (opcao) {
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
        String nome = JOptionPane.showInputDialog("Nome");
        String cnpj = JOptionPane.showInputDialog("cnpj");
        int id = Integer.parseInt(JOptionPane.showInputDialog("id"));

        ControllerPessoaJuridica cPessoaJuridica = new ControllerPessoaJuridica();
        PessoaJuridica entradaPF = new PessoaJuridica(id, nome, cnpj);
        PessoaJuridica saidaPF = (PessoaJuridica) cPessoaJuridica.Inserir(entradaPF);
        JOptionPane.showMessageDialog(null, saidaPF);
    }

    @Override
    public void alterar() {
        String nome = JOptionPane.showInputDialog("Nome");
        String cnpj = JOptionPane.showInputDialog("cnpj");
        int id = Integer.parseInt(JOptionPane.showInputDialog("id"));

        ControllerPessoaJuridica cPessoaJuridica = new ControllerPessoaJuridica();
        PessoaJuridica entradaPF = new PessoaJuridica(id, nome, cnpj);
        PessoaJuridica saidaPF = (PessoaJuridica) cPessoaJuridica.Inserir(entradaPF);
        JOptionPane.showMessageDialog(null, saidaPF);
    }

    @Override
    public void excluir() {
        int id = Integer.parseInt(JOptionPane.showInputDialog("ID"));

        ControllerPessoaJuridica cPessoaJuridica = new ControllerPessoaJuridica();
        Boolean saidaPessoaJuridica = cPessoaJuridica.Excluir(id);
        JOptionPane.showMessageDialog(null, saidaPessoaJuridica);
    }

    @Override
    public void buscar() {
        int id = Integer.parseInt(JOptionPane.showInputDialog("ID"));

        ControllerPessoaJuridica cPessoaJuridica = new ControllerPessoaJuridica();
        PessoaJuridica saidaPessoaJuridica = (PessoaJuridica) cPessoaJuridica.Buscar(id);
        JOptionPane.showMessageDialog(null, saidaPessoaJuridica);

    }

    @Override
    public void listar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listar'");
    }

}