package Lista_2;

import java.util.Scanner;

public class Atividade_5 {

    public static void main(String[] args) {

        int codigo_do_produto;
        int quantidade_comprada;
        String nome_do_produto = "";
        float valor_do_produto = 0.0f;

        Scanner leia = new Scanner(System.in);

        System.out.println("CÓDIGO DO PRODUTO |   PRODUTO     | PREÇO UNITÁRIO");
        System.out.println("-----------------------------------------------");
        System.out.println("1 - Cachorro Quente  | R$ 10.00");
        System.out.println("2 - X-Salada         | R$ 15.00");
        System.out.println("3 - X-Bacon          | R$ 18.00");
        System.out.println("4 - Bauru            | R$ 12.00");
        System.out.println("5 - Refrigerante     | R$ 8.00");
        System.out.println("6 - Suco de laranja  | R$ 13.00");
        
        System.out.print("\nDigite o código do produto (1 a 6): ");
        codigo_do_produto = leia.nextInt();

        switch (codigo_do_produto) {
            case 1:
                nome_do_produto = "Cachorro Quente";
                valor_do_produto = 10.00f;
                break;
            case 2:
                nome_do_produto = "X-Salada";
                valor_do_produto = 15.00f;
                break;
            case 3:
                nome_do_produto = "X-Bacon";
                valor_do_produto = 18.00f;
                break;
            case 4:
                nome_do_produto = "Bauru";
                valor_do_produto = 12.00f;
                break;
            case 5:
                nome_do_produto = "Refrigerante";
                valor_do_produto = 8.00f;
                break;
            case 6:
                nome_do_produto = "Suco de laranja";
                valor_do_produto = 13.00f;
                break;
            default:
                System.out.println("Código inválido!");
                leia.close();
                return;
        }

        System.out.print("Digite a quantidade comprada: ");
        quantidade_comprada = leia.nextInt();

        float valor_total = valor_do_produto * quantidade_comprada;

        System.out.println("\nProduto: " + nome_do_produto);
        System.out.println("Preço Unitário: R$ " + valor_do_produto);
        System.out.println("Quantidade: " + quantidade_comprada);
        System.out.println("Valor Total: R$ " + valor_total);

        leia.close();
    }
}


