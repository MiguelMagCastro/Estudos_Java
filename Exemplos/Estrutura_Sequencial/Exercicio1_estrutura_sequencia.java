import java.util.Scanner;

public class Exercicio1_estrutura_sequencia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x , y , soma;
		
		System.out.println("Digite o primeiro numero intero: ");
		x = sc.nextInt();
		System.out.println("Digite o segundo numero intero: ");
		y = sc.nextInt();
		
		soma = x + y;
		
		System.out.printf("Soma = %d", soma);
		
		sc.close();
	}

}
