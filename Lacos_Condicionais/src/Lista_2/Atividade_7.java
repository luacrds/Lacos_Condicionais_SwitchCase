package Lista_2;

import java.util.Scanner;

public class Atividade_7 {
    public static void main(String[] args) {

        float numero1, numero2, resultado;
        int codigo_da_operacao;

        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        numero1 = leia.nextFloat();

        System.out.print("Digite o segundo numero: ");
        numero2 = leia.nextFloat();

        System.out.println("\nCÓDIGO   | OPERAÇÕES :");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");

        System.out.print("Escolha a operação: ");
        codigo_da_operacao = leia.nextInt();

        switch(codigo_da_operacao) {
            case 1:
                resultado = numero1 + numero2;
                System.out.println("Resultado da Soma: " + resultado);
                break;

            case 2:
                resultado = numero1 - numero2;
                System.out.println("Resultado da Subtração: " + resultado);
                break;

            case 3:
                resultado = numero1 * numero2;
                System.out.println("Resultado da Multiplicação: " + resultado);
                break;

            
            case 4:
                resultado = numero1 / numero2;
                System.out.println("Resultado da Divisão: " + resultado);
                break;
        }

        
    }
}