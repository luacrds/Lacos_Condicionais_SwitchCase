package Lista_1;

import java.util.Scanner;

public class Atividade_3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String nome_do_doador;
		int idade;
		boolean primeira_doacao = true;
		
		
		System.out.print("Digite o seu nome:");
		nome_do_doador = leia.nextLine();
		
		System.out.print("Qual a sua idade?");
		idade = leia.nextInt();
		
		System.out.print("É a sua primeira doação?");
		primeira_doacao = leia.nextBoolean();
		
		if (idade >= 18 && idade < 60) {
			System.out.print (nome_do_doador + "está apto para doar");
		}
		
		if (idade >= 60 && primeira_doacao) {
			System.out.print(nome_do_doador + "não está apto para doar");
		}
		
		if (idade >= 60 && !primeira_doacao){
			System.out.print(nome_do_doador + "está apto para doar");
		}
		
	}
}
