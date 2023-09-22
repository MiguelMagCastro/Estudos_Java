import java.util.Scanner;

public class Atividade2_estrutura_condicional {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x;
		
		System.out.println("Digite um numero inteiro: ");
		x = sc.nextInt();
		
		if(x % 2 ==0) {
			
			System.out.println("Par");
			
		}else {
			
			System.out.println("Impar");
			
		}
		
		
		sc.close();
	}

}
