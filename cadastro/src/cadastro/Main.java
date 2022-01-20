package cadastro;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos clientes criar?");
		int n = sc.nextInt(); // tamanho do vetor
		System.out.printf("Digite os %d nomes:%n", n);
		String[] nomes = new String[n];
		
		for (int i=0; i<n; i++) {
			nomes[i] = sc.next();
		}
		for (int i=0; i<n; i++) {
		System.out.println(nomes[i]);
		}
		
		
		sc.close();
	}

	}

