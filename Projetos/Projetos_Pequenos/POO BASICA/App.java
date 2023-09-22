import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o nome da Equipe 1: ");
        String equipe1 = sc.nextLine();
        System.out.print("Informe o nome da Equipe 2: ");
        String equipe2 = sc.nextLine();

        Partida partida = new Partida(equipe1, equipe2);
        partida.imprimirPlacar();
        sc.close();
    }
}
