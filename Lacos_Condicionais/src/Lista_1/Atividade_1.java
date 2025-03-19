package Lista_1;

import java.util.Scanner;

public class Atividade_1 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int a, b,c;
		
		System.out.print("Digite o primeiro valor ");
        a= leia.nextInt();
        
        System.out.print("Digite o segundo valor ");
        b= leia.nextInt();
        
        System.out.print("Digite o terceiro valor ");
        c= leia.nextInt();
        
        int somando_valores = a+b;
        
        if (somando_valores > c) {
        	System.out.print("A soma de a+b é maior que c");
        }
        
        if (somando_valores < c) {
        	System.out.print("A soma de a+b é menor que c");
        }
	}

}
