import java.util.Scanner;

public class Tempo_Namoro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tempo , anos = 0;
		
		String Nome , Namorada;
		
		System.out.println("Digite seu nome: ");
		Nome = sc.next();
		System.out.printf("Ola %s , Qual o nome da sua namorada?\n",Nome);
		Namorada = sc.next();
		System.out.printf("%s é um nome bem bonito\n",Namorada);
		do {
		System.out.println("Voces namoram a quantos meses?");
		tempo = sc.nextInt();
		if(tempo <=0) {
			System.out.println("Os meses não podem ser menor ou igual a zero!!!");
		}
		}while(tempo <= 0);
			
		while(tempo>=12) {
			anos ++;
			tempo -= 12;
		}
		
		if(anos == 0) {
			if (tempo == 1) {
				System.out.printf("Nossa faz %d mes", tempo);
			}else {
				System.out.printf("Nossa ja faz %d meses", tempo);
			}	
		}else if(anos == 1) {
			if (tempo == 1) {
				System.out.printf("Nossa ja faz %d ano e %d mes", anos , tempo);
			}else {
				System.out.printf("Nossa ja faz %d ano e %d meses", anos , tempo);
			}	
		}else if(anos> 1) {
			if (tempo == 1) {
				System.out.printf("Nossa ja fazem %d anos e %d mes", anos , tempo);
			}else {
				System.out.printf("Nossa ja fazem %d anos e %d meses", anos , tempo);
			}	
		}
		
		sc.close();
	}

}
