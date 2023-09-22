public class Saida_de_dados {

	public static void main(String[] args) {
		
		int y = 3;
		double x = 100.25;
		String nome = "Miguel";
		
		System.out.println(y);
		System.out.println("Hello Word!");
		System.out.printf("%.2f\n", x);
		System.out.printf("%.4f\n", x);
		System.out.println("Resultado = "+ x +" Metros");
		System.out.printf("Resultado = %.2f metros\n", x);
		System.out.printf("%s está devendo %.2f reais para %d pessoas\n", nome,x,y);
		
	}
	
}
