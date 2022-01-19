package exercicioCondicionais05;

/*Ler codigo de peça 1, numero de peças 1, valor unitario de peças 1, codigo de peças 2, numero de peças 2 e valor unitario de peças 2. calcule e mostre o valor a ser pago.*/
import java.util.Scanner;
public class exercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int peca1, peca2;
		int numPeca1, numPeca2;
		double valorPeca1, valorPeca2;
		
		System.out.println("Digite o codigo da peça 1");
		peca1 = sc.nextInt();
		System.out.println("Digite o codigo da peça 2");
		peca2 = sc.nextInt();
		System.out.println("Digite a quantidade de peças 1");
		numPeca1 = sc.nextInt();
		System.out.println("Digite a quantidade de peças 2");
		numPeca2 = sc.nextInt();
		System.out.println("Digite o valor unitário de peças 1");
		valorPeca1 = sc.nextDouble();
		System.out.println("Digite o valor unitário de peças 2");
		valorPeca2 = sc.nextDouble();
		
		double totalPagar =  (numPeca1*valorPeca1) + (numPeca2*valorPeca2);
			System.out.printf("Peças %s%s, %s%s%nTotal a pagar = R$%.2f%n", peca1, numPeca1, peca2, numPeca2, totalPagar);
		
		
		sc.close();
	}

}
