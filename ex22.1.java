package lista4;
import java.util.Scanner;

public class Ex22.1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num1, num2;
		
		System.out.printf("Digite um número: ");
		num1=ler.nextInt();
		System.out.printf("Digite um número maior que o primeiro: ");
		num2=ler.nextInt();
		
		while(num2<num1) {
			System.out.printf("Esse número é menor que %d, digite outro: ",num1);
			num2=ler.nextInt();
		}
		System.out.printf("Obrigado!");
		ler.close();
	}

}
