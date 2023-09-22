import java.util.Scanner;

public class Atividade4_estrutura_condicional {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inicio , fim , duracao;
		
		System.out.println("Hora de incio e de fim do jogo: ");
		inicio = sc.nextInt();
		fim = sc.nextInt();
		
		if(inicio > fim) {
			
			duracao = (24 - inicio) + fim;
			
		}else if(inicio == fim) {
			
			duracao = 24;
			
		}else {
			
			duracao = fim - inicio;
			
		}
		
		System.out.printf("O jogo durou %d Hora(s)", duracao);
		
		
		sc.close();
	}

}
