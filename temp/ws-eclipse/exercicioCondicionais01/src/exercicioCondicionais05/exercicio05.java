package exercicioCondicionais05;

/*Ler codigo de pe�a 1, numero de pe�as 1, valor unitario de pe�as 1, codigo de pe�as 2, numero de pe�as 2 e valor unitario de pe�as 2. calcule e mostre o valor a ser pago.*/
import java.util.Scanner;
public class exercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int peca1, peca2;
		int numPeca1, numPeca2;
		double valorPeca1, valorPeca2;
		
		System.out.println("Digite o codigo da pe�a 1");
		peca1 = sc.nextInt();
		System.out.println("Digite o codigo da pe�a 2");
		peca2 = sc.nextInt();
		System.out.println("Digite a quantidade de pe�as 1");
		numPeca1 = sc.nextInt();
		System.out.println("Digite a quantidade de pe�as 2");
		numPeca2 = sc.nextInt();
		System.out.println("Digite o valor unit�rio de pe�as 1");
		valorPeca1 = sc.nextDouble();
		System.out.println("Digite o valor unit�rio de pe�as 2");
		valorPeca2 = sc.nextDouble();
		
		double totalPagar =  (numPeca1*valorPeca1) + (numPeca2*valorPeca2);
			System.out.printf("Pe�as %s%s, %s%s%nTotal a pagar = R$%.2f%n", peca1, numPeca1, peca2, numPeca2, totalPagar);
		
		
		sc.close();
	}

}
