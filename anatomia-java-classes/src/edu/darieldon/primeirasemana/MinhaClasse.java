package edu.darieldon.primeirasemana;

public class MinhaClasse {
    public static void main(String[] args) {
        // Aula 1 - Hello World
        System.out.println("Olá Mundo!");

        //Aula 2 - Declaração de variável
        final String BR = "Brasil";
        int ano = 2025;
        System.out.println(BR.concat(" ") + ano);

        //Aula 3 - padrões de nomes de variáveis
        String nome = "Darieldon";
        String sobrenome = "Medeiros";
        String nomeCompleto = nomeCompleto(nome, sobrenome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
