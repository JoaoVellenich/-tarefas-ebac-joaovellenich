package br.com.joaovellenich;

public class PessoaFisica extends Pessoa{
    private  String cpf;

    @Override
    public void showData() {
        System.out.println(cpf);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
