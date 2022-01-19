package exercicioCondicionais01;
import java.util.Scanner;
import java.util.Locale;
/*Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa*/

public class exercicio {
	

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
			int numero1, numero2;
			System.out.println("Digite o primeiro numero inteiro:");
			numero1 = sc.nextInt();
			System.out.println("Digite o segundo numero inteiro");
			numero2 = sc.nextInt();
			int soma;
			soma = numero1+numero2;
			System.out.printf("A soma dos dois valores é %s%n", soma);
		
		sc.close();
		

	}

}
