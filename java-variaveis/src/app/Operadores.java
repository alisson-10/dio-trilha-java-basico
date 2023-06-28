package app;

public class Operadores {

    public static void main(String[] args) {
        String nomeLinguagem = "Linguagem" + "Java";
        System.out.println(nomeLinguagem);

        int numero = 10;
        numero = - numero;
        System.out.println(numero);
        numero = numero * (-1);
        System.out.println(numero);

        // Exemplo de incremento utilizando o operador "++":

        int idade = 23;
        idade ++;
        System.out.println(idade);

        //Exemplo de inversão de valores true or false:

        boolean tipo = true;
        tipo = !tipo;
        System.out.println(tipo);

        //Exemplo de aplicação de operador ternário "?" e ":":

        byte a = 5;
        byte b = 7;
        String resultado = a==b ?"verdadeiro":"falso";
        System.out.println(resultado);

        // Operadores Relacionais:

        // == Quando desejamos verificar se uma variável é IGUAL a outra.
        // != Quando desejamos verificar se uma variável é DIFERENTE da outra.
        // > Quando desejamos verificar se uma variável é MAIOR que a outra.
        // >= Quando desejamos verificar se uma variável é MAIOR OU IGUAL a outra.
        // < Quando desejamos verificar se uma variável é MENOR que a outra.
        // <= Quando desejamos verificar se uma variável é MENOR OU IGUAL a outra.

        int valor1 = 2;
        int valor2 = 7;

        boolean simNao = valor1 == valor2;
        System.out.println("O valor1 é igual ao valor2?" + simNao);

        boolean certoErrado = valor1 != valor2;
        System.out.println("O valor1 é diferente do valor2?" + certoErrado);

        


 

    

    }
}