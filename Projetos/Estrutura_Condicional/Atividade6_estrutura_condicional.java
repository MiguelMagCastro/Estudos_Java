import java.util.Locale;
import java.util.Scanner;

public class Atividade6_estrutura_condicional {

	public static void main(String[] args) {
		//define a localização
		Locale.setDefault(Locale.US);
		//cria o Scanner
		Scanner sc = new Scanner(System.in);
		
		double x;
		
		System.out.println("Digite o numero: ");
		x = sc.nextDouble();
		
		if(x >= 0.00 && x <= 25.00) {
			
			System.out.println("Intervalo [0,25]");
			
		}else if( x > 25.00  && x <= 50.00) {
			
			System.out.println("Intervalo [25,50]");
			
		}else if( x > 50.00  && x <= 75.00) {
			
			System.out.println("Intervalo [50,75]");
			
		}else if( x > 75.00  && x <= 100.00) {
			
			System.out.println("Intervalo [75,100]");
			
		}else {
			
			System.out.println("Fora dos intervalos");
			
		}
		
		sc.close();
		
	}

}
