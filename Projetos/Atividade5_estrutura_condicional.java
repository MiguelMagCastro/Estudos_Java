import java.util.Locale;
import java.util.Scanner;

public class Atividade5_estrutura_condicional {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int cod , quant ;
		double preco;
		double total;
		
		System.out.println("Digite o codigo e a quantidade: ");
		cod = sc.nextInt();
		quant = sc.nextInt();
		
		if(cod == 1) {
			
			preco = 4.00;
			total = (double) quant * preco;
			System.out.printf("Total: R$ %.2f",total);
			
		}else if(cod == 2) {
			
			preco = 4.50;
			total = (double) quant * preco;
			System.out.printf("Total: R$ %.2f",total);
			
		}else if(cod == 3) {
			
			preco = 5.00;
			total = (double) quant * preco;
			System.out.printf("Total: R$ %.2f",total);
			
		}else if(cod == 4) {
			
			preco = 2.00;
			total = (double) quant * preco;
			System.out.printf("Total: R$ %.2f",total);
			
		}else if(cod == 5) {
			
			preco = 1.50;
			total = (double) quant * preco;
			System.out.printf("Total: R$ %.2f",total);
			
		}
		
		sc.close();
		
	}

}
