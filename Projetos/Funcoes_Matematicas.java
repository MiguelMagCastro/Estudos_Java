
public class Funcoes_Matematicas {

	public static void main(String[] args) {
		
		double x = 5.0 , y = 6.0 , z = 7.0;
		int neg1 = -123 , neg2 = -213 , num = 232;
		double A , B , C ;
		
		A = Math.sqrt(100);
		B = Math.sqrt(144);
		C = Math.sqrt(49);
	
		System.out.printf("Raiz quadra de 100 = %.2f\n", A);
		System.out.printf("Raiz quadra de 144 = %.2f\n", B);
		System.out.printf("Raiz quadra de 49 = %.2f\n", C);
		
		A = Math.pow(x,x);
		B = Math.pow(y,y);
		C = Math.pow(z,z);
		
		System.out.printf("\n%.1f elevado a %.1f = %.1f\n",x , x , A);
		System.out.printf("%.1f elevado a %.1f = %.1f\n",y , y , B);
		System.out.printf("%.1f elevado a %.1f = %.1f\n",z , z , C);
		
		A = Math.abs(neg1);
		B = Math.abs(neg2);
		C = Math.abs(num);
		
		System.out.printf("\nValor absoluto de %d = %.1f\n",neg1 , A);
		System.out.printf("Valor absoluto de %d = %.1f\n",neg2, B);
		System.out.printf("Valor absoluto de %d = %.1f\n",num, C);
		
	}

}
