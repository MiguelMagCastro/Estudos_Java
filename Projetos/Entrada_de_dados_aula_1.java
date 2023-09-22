import java.util.Scanner;

public class Entrada_de_dados_aula_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		double y;
		char t;
		String b;
		
		System.out.print("Digite um numero inteiro: ");
		x = sc.nextInt();
		System.out.print("Digite um numero com decimal: ");
		y = sc.nextDouble();
		System.out.print("Digite uma Letra: ");
		t = sc.next().charAt(0);
		System.out.print("Digite uma palavra: ");
		b = sc.next();
		
		System.out.printf("\nnumero inteiro: %d",x);
		System.out.printf("\nnumero com decimal: %.2f",y);
		System.out.printf("\nLetra: %s",t);
		System.out.printf("\nPalavra: %s",b);
		sc.close();
	}

}
