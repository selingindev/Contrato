/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contrato.model.dados;

/**
 *
 * @author LAB_211
 */
public class PessoaFisica extends Pessoa{
    
    private String cpf;

    public PessoaFisica(int id, String nome, String cpf) {
        super(id, nome);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        String msg = super.toString();
        msg = msg + " PessoaFisica{" + "cpf=" + cpf + '}' ;
        return msg;
    }
    
}
