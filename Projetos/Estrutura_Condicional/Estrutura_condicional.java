import java.util.Scanner;

public class Estrutura_condicional {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int horas;
		
		do {
		System.out.println("Quantas horas sao agora?");
		horas = sc.nextInt();
		
		if(horas >= 1 && horas < 12){
			
			System.out.println("Bom dia tropinha");
		
		}else if(horas >= 12 && horas < 18) {
			
			System.out.println("Boa tarde tropinha");
			
		}else if (horas >= 18 && horas <= 24){
			
			System.out.println("Boa noite tropinha");
			
		}else {
			
			System.out.println("Horas não podem ser menor que 0 e maior que 24");
			
		}
		
		}while(horas > 24 || horas < 0);
		
		sc.close();
	}

}
