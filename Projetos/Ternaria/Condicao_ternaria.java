import java.util.Locale;
import java.util.Scanner;

public class Condicao_ternaria {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x;
		
		System.out.println("Digite um numero");
		x = sc.nextDouble();
		
		String numero = (x < 0)?"Negativo" : "Positivo";
		
		System.out.println(numero);
		
		sc.close();
	}

}