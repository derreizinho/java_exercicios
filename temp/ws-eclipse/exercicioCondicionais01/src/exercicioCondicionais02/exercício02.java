package exercicioCondicionais02;
import java.util.Scanner;
import java.util.Locale;
	/*Fazer um programa que lê o valor de um raio de um cirulo e, em seguida, calcule sua área mostrando o resultado com quatro casas decimais*/
public class exercício02 {
	//raio do circulo 2piR^2
	//pi = 3.14159
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner show = new Scanner(System.in);
			
			System.out.println("Digite o raio do círulo(em metros) a seguir:");
		double raio; 
		raio = show.nextDouble();
		double area  = 3.14159 *Math.pow(raio,2);
			System.out.printf("A area do circulo em questão equivale a %.4f metros quadrados%n", area);
		
		
		show.close();

	}

}
