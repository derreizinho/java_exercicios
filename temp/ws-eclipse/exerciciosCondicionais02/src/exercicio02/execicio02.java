package exercicio02;
//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
import java.util.Scanner;
public class execicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		
		System.out.println("digite um numero inteiro");
		numero = sc.nextInt();
		int resultado = numero %2;
		if (resultado > 0) {
			System.out.println("o numero é ÍMPAR");
		}
		else {
		System.out.println("o número é PAR");}
		
		sc.close();
	}

}
