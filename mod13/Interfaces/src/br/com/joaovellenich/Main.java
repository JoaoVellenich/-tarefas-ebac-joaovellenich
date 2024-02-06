package br.com.joaovellenich;

public class Main {
    public static void main(String[] args) {
        PessoaFisica pf = new PessoaFisica();
        pf.setCpf("123");
        pf.setName("Jorge");
        pf.showData();

        PessoaJuridica pj = new PessoaJuridica();
        pj.setCnpj("456");
        pj.setName("Marcos");
        pj.showData();
    }
}
