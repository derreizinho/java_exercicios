package aplication;

import java.util.Locale;
import java.util.Scanner;
import entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Account account; // foi chamado fora para que seja possivel chamar metodos e atributos, quando é
							// instanciado dentro do escopo do if, não pode ser ultilizado fora

		// criacao de conta
		System.out.println("Enter account number:");
		int number = sc.nextInt();
		System.out.println("Enter account holder");
		sc.nextLine();// esse serve somente para consumir a quebra de linha que o de cima não possui
		String holder = sc.nextLine();
		System.out.println("Is there any inicial deposit (y/n)?");
		char response = sc.next().charAt(0);
		// apos resposta chama ou nao metodo deposit presente na classe Account
		if (response == 'y') {
			System.out.println("Enter inicial deposit value:");
			double inicialDeposit = sc.nextDouble();
			account = new Account(number, holder, inicialDeposit); // construtor triplo com função deposito inicial, foi
																	// chamado account fora para que a instancia não
																	// ficasse preservada ao escopo de if

		} 
			else {
			account = new Account(number, holder);
		}
System.out.println();

		//aqui termina a entrada de dados primária.
		//Após customizado o toString na classe account, podemos usar sysout para mostrar no console
	System.out.println(account);


		sc.close();
	}

}
