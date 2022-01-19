package exercicio01;
import java.util.Scanner;
/*Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.*/
public class exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		System.out.println("Digite um numero inteiro");
		numero = sc.nextInt();
			if(numero < 0) {
				System.out.printf("%s é um numero NEGATIVO!",numero);
				
			}
			else if(numero > 0) {
				System.out.printf("%s é um numero POSITIVO!",numero);
			}
			else {
				System.out.println("0 é NEUTRO!");
			}
		
		
				sc.close();
	}

}
