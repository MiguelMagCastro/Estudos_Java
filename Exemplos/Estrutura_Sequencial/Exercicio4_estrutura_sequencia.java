import java.util.Locale;
import java.util.Scanner;

public class Exercicio4_estrutura_sequencia {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		int num , horas;
		double sal , sal_total;
		
		System.out.println("Digite o numero do funcionario: ");
		num = sc.nextInt();
		System.out.println("Digite o numero de horas: ");
		horas = sc.nextInt();
		System.out.println("Digite o valor por horas: ");
		sal = sc.nextDouble();
		
		sal_total = (double) sal * horas;
		
		System.out.printf("NUMBER = %d\n",num);
		System.out.printf("NUMBER = %.2f\n",sal_total);
		
		sc.close();
	}

}
