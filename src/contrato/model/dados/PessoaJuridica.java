/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contrato.model.dados;

/**
 *
 * @author LAB_211
 */
public class PessoaJuridica extends Pessoa{
    
    private String cnpj;

    public PessoaJuridica(int id, String nome, String cnpj) {
        super(id, nome);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    @Override
    public String toString() {
        String msg = super.toString();
        msg = msg + " Fornecedor{" + "cnpj=" + cnpj + '}';
        return msg;
    }

    
}
