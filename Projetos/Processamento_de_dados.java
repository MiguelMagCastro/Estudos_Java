
public class Processamento_de_dados {

	public static void main(String[] args) {
		int x = 10;
		int a = 5 , c = 2;
		
		double h = 5.0 , b = 6.0 , B = 8.0 , area;
		double y;
		double soma;
		
		y = x * 2;
		
		area = ((b+B)/2.0) * h;
		
		//(double) faz com que o programa não descarte o valor apos a virgula
		soma = (double) a / c;
		
		System.out.printf("Valor de X: %d\n", x);
		System.out.printf("Valor de Y: %.1f\n", y);
		System.out.printf("Valor da area: %.1f\n", area);
		System.out.printf("Valor da soma: %.1f\n", soma);

	}

}
