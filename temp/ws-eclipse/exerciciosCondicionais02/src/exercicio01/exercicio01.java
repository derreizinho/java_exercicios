package exercicio01;
import java.util.Scanner;
/*Fazer um programa para ler um n�mero inteiro, e depois dizer se este n�mero � negativo ou n�o.*/
public class exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		System.out.println("Digite um numero inteiro");
		numero = sc.nextInt();
			if(numero < 0) {
				System.out.printf("%s � um numero NEGATIVO!",numero);
				
			}
			else if(numero > 0) {
				System.out.printf("%s � um numero POSITIVO!",numero);
			}
			else {
				System.out.println("0 � NEUTRO!");
			}
		
		
				sc.close();
	}

}
