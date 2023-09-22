import java.util.Locale;
import java.util.Scanner;


public class Atividade7_estrutura_condicional {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x , y ;
		
		System.out.println("Digite os valores: ");
		x = sc.nextDouble();
		y = sc.nextDouble();
		
		if(x == 0.0 && y == 0.0){
			
			System.out.println("Origem");
			
		}else if(x == 0.0 || y == 0.0){
			
			if(x == 0.0) {
				
				System.out.println("Eixo X");
				
			}else {
				
				System.out.println("Eixo Y");
				
			}	
			
		}else if(x > 0.0) {
			
			if(y > 0.0) {
				
				System.out.println("Q1");
				
			}else {
				
				System.out.println("Q4");
				
			}
			
		}else {
			
			if(y < 0.0) {
				
				System.out.println("Q3");
				
			}else {
				
				System.out.println("Q2");
				
			}
			
			
		}
		
		sc.close();
		
	}

}
