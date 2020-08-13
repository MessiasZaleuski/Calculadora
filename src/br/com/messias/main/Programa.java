package br.com.messias.main;

import java.util.Scanner;

import br.com.messias.operacoes.Divide;
import br.com.messias.operacoes.Multiplica;
import br.com.messias.operacoes.Soma;
import br.com.messias.operacoes.Subtrai;

public class Programa {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Soma s1 = new Soma();
		Divide d1 = new Divide();
		Multiplica m1 = new Multiplica();
		Subtrai sub1 = new Subtrai();
		
		System.out.println("Digite o primeiro numero: ");
		int n1 = sc.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		int n2 = sc.nextInt();
		
		System.out.println("O resultado da soma é: " + s1.getResultado(n1, n2));
		System.out.println("O resultado da multiplicação é: " + m1.getResultado(n1, n2));
		System.out.println("O resultado da Subtração é: " + sub1.getResultado(n1, n2));
		System.out.println("O resultado da divisão é: " + d1.getResultado(n1, n2));
		
		sc.close();

	}

}
