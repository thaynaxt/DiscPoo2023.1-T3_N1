package br.edu.principal;
import java.util.*;

public class Principal {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double soma = 0;
		int qtd = 0;
		int qtdPares = 0;
		System.out.println("Intervalos crescentes ou decrescentes");
		System.out.println("Digite o primeiro número: ");
		double num1 = sc.nextDouble();
		System.out.println("Digite o segundo número: ");
		double num2 = sc.nextDouble();
		
		if (num1 == num2) {
		    System.out.println("Números iguais.");
		}
		if (num1 < num2) {
		    for (double i = num1; i <= num2; i++) {
		        soma = soma + i;
		        qtd = qtd + 1;
		    }
		double media = soma/qtd;
		System.out.println("O intervalo é crescente e a média dos números desse intervalo é: "+media);
		}
		if (num1 > num2) {
		    for (double i = num2; i <= num1; i++) {
		        if ((i%2) == 0) {
		            qtdPares = qtdPares + 1;
		        }
		    }
		System.out.println("O intervalo é decrescente, portanto a quatidade de números pares do intervalo é: "+qtdPares);    
		}
		
	}
}