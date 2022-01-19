package exerciciosCondicionais04;

/*programa que leia numero do funcionario, horas trabalhadas, horas trabalhadas e salário por hora. Depois mostrar numero do funcionario e o salário*/
import java.util.Scanner;
import java.util.Locale;


public class exercicio04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		
		int NUMBER;
		System.out.println("Digite o numero do funcionário:");
		NUMBER = sc.nextInt();
		
		double HOURS;
		System.out.println("Digite quantas horas o funcionário trabalhou:");
		HOURS = sc.nextDouble();
		
		double VALUE;
		System.out.println("Digite o valor que o mesmo recebe por hora trabalhada");
		VALUE = sc.nextDouble();
		
		double SALARY = HOURS*VALUE;
		
		System.out.printf("NUMBER = %d %n SALARY = U$%.2f  " , NUMBER , SALARY);
		

			
		
		
		
		
		
		sc.close();
	}

}
