package lista4;
import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		char s1;
		
		do {
			System.out.printf("Informe seu sexo: ");
			s1=ler.next().charAt(0);
			if(s1=='M'||s1=='F')
				break;
			System.out.println("Resposta inválida!");
		}
		while((s1!='F')&&(s1!='M'));
		
		System.out.printf("Obrigado!");
		ler.close();
	}

}
