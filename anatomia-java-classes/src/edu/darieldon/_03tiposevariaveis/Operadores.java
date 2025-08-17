package edu.darieldon._03tiposevariaveis;

public class Operadores {
    public static void main(String[] args) {
        String nomeCompleto = "LINGUAGEM " + "JAVA";
        System.out.println(nomeCompleto);

        //Como funciona a concatenação de strings com outros tipos
        String concatenacao = "?";
        System.out.println(concatenacao);
        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);
        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);
        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);
        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);
        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);

        int numero = 5;
        //Aplicação do sinal ao imprimir
        System.out.println(-numero);
        System.out.println(numero);

        //Incremento e decremento
        System.out.println(++ numero);
        System.out.println(-- numero);

        boolean variavel = true;
        System.out.println(!variavel);

        int a;
        int b;
        a = 5;
        b = 5;
        //Operador ternário
        String resultado = a == b ? "Verdadeiro" : "Falso";
        System.out.println(resultado);

        // Verificaçõ de condições
        int numero1 = 1;
        int numero2 = 2;
        boolean simNao = numero1 == numero2;
        System.out.println("numeroUm é igual ao númeroDois? " + simNao);
        simNao = numero1 != numero2;
        System.out.println("numeroUm é diferente de númeroDois? " + simNao);

        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && condicao2) System.out.println("As duas condições são verdadeiras");
        if(condicao1 || condicao2) System.out.println("Uma das condições é verdadeira");
    }
}
