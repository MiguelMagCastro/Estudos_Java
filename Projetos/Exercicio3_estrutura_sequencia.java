import java.util.Locale;
import java.util.Scanner;

public class Exercicio3_estrutura_sequencia {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		int A , B , C , D , diferenca;
		
		System.out.println("Digite um numero: ");
		A = sc.nextInt();
		System.out.println("Digite um numero: ");
		B = sc.nextInt();
		System.out.println("Digite um numero: ");
		C = sc.nextInt();
		System.out.println("Digite um numero: ");
		D = sc.nextInt();
		
		diferenca = (A*B - C*D);
		
		System.out.printf("DIFERENCA = %d", diferenca);
		
		
		sc.close();
	}

}
