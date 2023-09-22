import java.util.Locale;
import java.util.Scanner;

public class Exercicio6_estrutura_sequencia {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double A , B , C , pi = 3.14159 ;
		double triangulo , circulo , trapezio, quadrado , retangulo ;
		
		System.out.println("Valor de A , B e C: ");
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		triangulo = (A * C) / 2.0;
		
		circulo = pi * Math.pow(C, 2);
		
		trapezio = ((A + B) * C) /2;
		
		quadrado = B *B;
		
		retangulo = A * B;
		
		System.out.printf("Triangulo: %.3f\n",triangulo);
		System.out.printf("Circulo: %.3f\n",circulo);
		System.out.printf("Trapezio: %.3f\n",trapezio);
		System.out.printf("Quadrado: %.3f\n",quadrado);
		System.out.printf("Circulo: %.3f\n",retangulo);
		
		
		sc.close();
	}

}
