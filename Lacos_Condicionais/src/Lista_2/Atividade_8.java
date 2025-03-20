package Lista_2;

import java.util.Scanner;


public class Atividade_8 {
	public static void main(String[] args) {
	
	float saldo_inicial = 10000.0f;
	int codigo_da_operacao;
	
	Scanner leia = new Scanner(System.in);
	
	System.out.print ("CÓDIGO DA OPERAÇÃO |  OPERAÇÃO");
	System.out.println("\n SALDO");
	System.out.println("\n SAQUE");
	System.out.println("\n DEPÓSITO");
	
	System.out.print("\nDigite o código da operação (1 a 3): ");
    codigo_da_operacao= leia.nextInt();
	
    switch (codigo_da operacao) {
    
    case 1 codigo_da_operacao = "SALDO";
    
    break;
    
    case 2 codigo_da_operacao = "SAQUE"
    		
    break;
    
    case 3 codigo_da operacao ="DEPÓSITO"
    
    break;
    }

	
}

}