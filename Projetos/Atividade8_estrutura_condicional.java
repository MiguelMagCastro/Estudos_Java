import java.util.Locale;
import java.util.Scanner;

public class Atividade8_estrutura_condicional {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double sal, imposto ;
		
		System.out.println("Salario:");
		sal = sc.nextDouble();
		
		if(sal >= 0.00 && sal <= 2000.00) {
			
			System.out.println("Isento");
			
		}else if(sal > 2000.00 && sal <= 3000.00) {
			
			imposto = (sal - 2000.00) * 0.08;
			System.out.printf("R$ %.2f", imposto);
			
		}else if(sal > 3000.00 && sal <= 4500.00) {
			
			imposto = ((sal - 3000.00 ) * 0.18)  + (1000.00 * 0.08);
			System.out.printf("R$ %.2f",imposto);
			
		}else if(sal > 4500.00) {
			
			imposto = ((sal - 4500) * 0.28) + (1500.00 * 0.18) + (1000.00 * 0.08);
			System.out.printf("R$ %.2f",imposto);
			
		}else {
			System.out.println("Salario n pode ser menor que 0.00");
		}
		
		
		
		
		sc.close();
	}

}
