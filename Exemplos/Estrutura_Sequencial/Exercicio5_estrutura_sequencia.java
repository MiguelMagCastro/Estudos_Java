import java.util.Locale;
import java.util.Scanner;

public class Exercicio5_estrutura_sequencia {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int   num1, num2;
		double val1 , val2 , pag;
		
		System.out.println("número de peças , valor unitário de cada peça: ");
		num1 = sc.nextInt();
		val1 = sc.nextDouble();
		
		System.out.println("número de peças , valor unitário de cada peça: ");
		num2 = sc.nextInt();
		val2 = sc.nextDouble();
		
		pag = (double) val1 * num1 + val2 * num2;
		
		System.out.printf("Valor a pagar = %.2f",pag);
		
		sc.close();
	}

}
