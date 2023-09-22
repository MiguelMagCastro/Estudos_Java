import java.util.Scanner;

public class Atividade1_estrutura_condicional {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x;
		
		System.out.println("Digite um numero inteiro: ");
		x = sc.nextInt();
		
		if(x<0) {
			
			System.out.println("Negativo");
			
		}else {
			
			System.out.println("Não Negativo");
			
		}
		
		sc.close();
	}

}
