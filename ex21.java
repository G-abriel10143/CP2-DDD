package lista4;
import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num;
		
		
		
		do {
			System.out.printf("Digite um número positivo: ");
			num=ler.nextInt();
		}
		while(num<=0);
		System.out.printf("Fim");
ler.close();
	}

}
