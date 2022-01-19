package exercicioCondicionais03;
import java.util.Scanner;
import java.util.Locale;
	/*ler 4 valores inteiros A B C D E e em seguida calcular a diferença dos produtos de AB e CD*/
public class exercicio03 {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner show = new Scanner(System.in);
			
			System.out.println("Digite  quatro numeros INTEIROS a seguir:");
		int A;
		A = show.nextInt();
		int B;
		B = show.nextInt();
		int C;
		C = show.nextInt();
		int D;
		D= show.nextInt();
		int diferenca = (A*B)-(C*D);
			System.out.printf("A diferença dos produtos equivale a %s %n", diferenca);
		
		
		show.close();

	}

}
