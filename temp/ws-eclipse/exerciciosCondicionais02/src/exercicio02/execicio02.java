package exercicio02;
//Fazer um programa para ler um n�mero inteiro e dizer se este n�mero � par ou �mpar.
import java.util.Scanner;
public class execicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		
		System.out.println("digite um numero inteiro");
		numero = sc.nextInt();
		int resultado = numero %2;
		if (resultado > 0) {
			System.out.println("o numero � �MPAR");
		}
		else {
		System.out.println("o n�mero � PAR");}
		
		sc.close();
	}

}
