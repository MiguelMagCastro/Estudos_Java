import java.util.Scanner;

public class Atividade3_estrutura_condicional {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x , y;
		
		System.out.println("Numero inteiro: ");
		x = sc.nextInt();
		System.out.println("Numero inteiro: ");
		y= sc.nextInt();
		
		if(x % y == 0 || y % x == 0) {
			
			System.out.println("Sao multiplos");
			
		}else {
			
			System.out.println("Nao sao multiplos");
			
		}
		
		
		sc.close();
	}

}
