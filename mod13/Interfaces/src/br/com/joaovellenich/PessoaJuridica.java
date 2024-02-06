package br.com.joaovellenich;

public class PessoaJuridica extends Pessoa{
    private String cnpj;

    @Override
    public void showData() {
        System.out.println(cnpj);
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
