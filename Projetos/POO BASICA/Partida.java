import java.util.Scanner;

public class Partida {
    private String nomeEquipe1;
    private String nomeEquipe2;
    private String vencedor;
    private int[] placarEquipe1;
    private int[] placarEquipe2;
    private int prorrogacaoEquipe1;
    private int prorrogacaoEquipe2;
    private int pontosEquipe1;
    private int pontosEquipe2;
    
    
    
    Scanner sc = new Scanner(System.in);
    
    public Partida(String nomeEquipe1, String nomeEquipe2) {
        this.nomeEquipe1 = nomeEquipe1;
        this.nomeEquipe2 = nomeEquipe2;
        this.placarEquipe1 = new int[4];
        this.placarEquipe2 = new int[4];
        this.prorrogacaoEquipe1 = 0;
        this.prorrogacaoEquipe2 = 0;
        this.pontosEquipe1 = 0;
        this.pontosEquipe2 = 0;
        informarPontuacao();
        calcularVencedor();
    }

    
    
    private void informarPontuacao() {
    	
        for (int i = 0; i < 4; i++) {
            System.out.print("Pontuação do " + (i + 1) + "º quarto para " + nomeEquipe1 + ": ");
            placarEquipe1[i] = sc.nextInt();
            this.pontosEquipe1 += placarEquipe1[i];
            
            System.out.print("Pontuação do " + (i + 1) + "º quarto para " + nomeEquipe2 + ": ");
            placarEquipe2[i] = sc.nextInt();
            this.pontosEquipe2 += placarEquipe2[i];
            
            if (this.pontosEquipe1 == this.pontosEquipe2 && i == 3) {
            	int j=1;
                System.out.print("Pontuação do " + j +"º quarto da prorrogação " + nomeEquipe1 + ": ");
                int prorrogacaoEquipe1 = sc.nextInt();
                System.out.print("Pontuação do " + j +"º quarto da prorrogação " + nomeEquipe2 + ": ");
                int prorrogacaoEquipe2 = sc.nextInt();
                
                this.prorrogacaoEquipe1+=prorrogacaoEquipe1;
                this.prorrogacaoEquipe2+=prorrogacaoEquipe2;
                
                this.pontosEquipe1+=prorrogacaoEquipe1;
                this.pontosEquipe2+=prorrogacaoEquipe2;
                
                while (prorrogacaoEquipe1 == prorrogacaoEquipe2) {
                	j++;
                	System.out.print("Pontuação do " + j +"º quarto da prorrogação " + nomeEquipe1 + ": ");
                    prorrogacaoEquipe1 = sc.nextInt();
                    System.out.print("Pontuação do " + j +"º quarto da prorrogação " + nomeEquipe2 + ": ");
                    prorrogacaoEquipe2 = sc.nextInt();
                    
                    this.prorrogacaoEquipe1+=prorrogacaoEquipe1;
                    this.prorrogacaoEquipe2+=prorrogacaoEquipe2;
                    
                    this.pontosEquipe1+=prorrogacaoEquipe1;
                    this.pontosEquipe2+=prorrogacaoEquipe2;
                    
                }
                break;
            }
        }
    }

    
    
    private void calcularVencedor() {
        int totalPontosEquipe1 = 0;
        int totalPontosEquipe2 = 0;

        for (int i = 0; i < 4; i++) {
            totalPontosEquipe1 += placarEquipe1[i];
            totalPontosEquipe2 += placarEquipe2[i];
        }

        totalPontosEquipe1 += prorrogacaoEquipe1;
        totalPontosEquipe2 += prorrogacaoEquipe2;

        if (totalPontosEquipe1 > totalPontosEquipe2) {
        	this.vencedor = nomeEquipe1;
        } else{
            this.vencedor =  nomeEquipe2;
        } 
    }
    
    
    
    public void imprimirPlacar() {
        System.out.println("\t1Q\t2Q\t3Q\t4Q\tPR\tFINAL");
        System.out.print(nomeEquipe1 + "\t");
        for (int i = 0; i < 4; i++) {
            System.out.print(placarEquipe1[i] + "\t");
        }
        if(prorrogacaoEquipe1<=0) {
        	System.out.print("--" + "\t" + pontosEquipe1 + "\n");
        }else {
        	System.out.print(prorrogacaoEquipe1 + "\t" + pontosEquipe1 + "\n");
        }
        System.out.print(nomeEquipe2 + "\t");
        for (int i = 0; i < 4; i++) {
            System.out.print(placarEquipe2[i] + "\t");
        }
        
        if(prorrogacaoEquipe2<=0) {
        	System.out.print("--" + "\t" + pontosEquipe2 + "\n");
        }else {
        System.out.print(prorrogacaoEquipe2 + "\t" + pontosEquipe2 + "\n");
        }
    }
}