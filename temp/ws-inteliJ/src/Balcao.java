import java.util.Scanner;
public class Balcao {


    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);



    System.out.println("Digite o nome do produto:");
    String produto = sc.next();

    System.out.println("Qual o preço do produto?");
    double preco = sc.nextDouble();


        //modulo teste paara desconto true/false não implementado nesse projeto
    /*System.out.println("O produto tem desconto? y/n");
    char respostaDesconto = sc.next().charAt(0);
    if (respostaDesconto == "y"){
        mostruario.desconto = true;
    }
    else{
        mostruario.desconto = false;
    }*/
        Mostruario mostruario = new Mostruario(produto,preco);
        System.out.println(mostruario);

       sc.close();
    }


}