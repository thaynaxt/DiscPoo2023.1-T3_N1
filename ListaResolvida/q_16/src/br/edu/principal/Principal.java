package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double soma = 0;
		double mult = 1;
		
		System.out.println("Soma (dos nº pares) e multiplicação (ímpares) do intervalo entre dois números desejado");
		System.out.println("***************************************************************************************");
		
		System.out.print("Digite o primeiro número: ");
		double n1 = sc.nextDouble();
		System.out.print("Digite o segundo número: ");
		double n2 = sc.nextDouble();
		
		if (n1 == n2) {
		    if((n1%2) == 0) {
		        soma = soma + n1;
		    }
		    else { mult = mult * n1;
		    }
		}
		if (n1 < n2) {
		    for (double i = n1; i <= n2; i++) {
		        if ((i%2) == 0) {
		            soma = soma + i;
		        }  
		        else { mult = mult * i; 
		        }
		    }  
		}   
		if (n1 > n2) {
		    for (double i = n2; i <= n1; i++) {
		       if ((i%2) == 0) {
		            soma = soma + i;
		        }  
		        else {mult = mult * i; 
		        } 
		    }
		}        
        System.out.println("A soma dos números pares desse intervalo (incluindo os números digitados) é: "+soma);
        System.out.println("A multiplicação dos números ímpares desse intervalo(incluindo os números digitados)é: "+mult);
	}
}
