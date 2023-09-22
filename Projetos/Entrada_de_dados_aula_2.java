import java.util.Scanner;

public class Entrada_de_dados_aula_2 {

	public static void main(String[] args) {
		Scanner teste = new Scanner(System.in);
		
		int x;
		
		String s1 , s2 , s3 ;
		
		System.out.println("Digite um numero: ");
		x = teste.nextInt();
		teste.nextLine();
		System.out.println("Digite a primeira Frase: ");
		s1 = teste.nextLine();
		System.out.println("Digite a segunda Frase: ");
		s2 = teste.nextLine();
		System.out.println("Digite a terceira Frase: ");
		s3 = teste.nextLine();
		
		System.out.printf("Numero: %d", x);
		System.out.printf("\nPrimeira frase: %s", s1);
		System.out.printf("\nSegunda frase: %s", s2);
		System.out.printf("\nTerceira frase: %s", s3);
		
		
		
		
		
		teste.close();
	}

}
