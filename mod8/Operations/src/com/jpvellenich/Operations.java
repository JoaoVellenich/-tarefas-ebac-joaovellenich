package com.jpvellenich;

public class Operations {
    public static void main(String[] args) {
        double nota1 = 9.4;
        double nota2 = 6.4;
        double nota3 = 0.4;
        double nota4 = 0.4;
        double media = 0;

        media = (nota3 + nota2 + nota1 + nota4) / 4;

        if(media >= 7){
            System.out.println("Aprovado");
        }else if(media >=5){
            System.out.println("Recuperação");
        }else {
            System.out.println("Reprocado");
        }

        System.out.println("A media das 4 notas é " + media);
    }
}
