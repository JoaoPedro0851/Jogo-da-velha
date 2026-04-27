import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tabuleiro tabuleiro = new Tabuleiro(new Jogador("Jogador 1", 1), new Jogador("Jogador 2", 2));
        tabuleiro.iniciarTabuleiro();
        tabuleiro.exibirTabuleiro();
    }
}