

public class Tabuleiro {

    private int casas[][];
    private Jogador jogador1;
    private Jogador jogador2;
    private int jogadorAtual = 1;

    public Tabuleiro(Jogador jogador1, Jogador jogador2) {
        this.casas = new int[3][3];
        this.jogador1 = jogador1;
        this.jogador2 = jogador2;
    }

    public void iniciarTabuleiro() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                casas[i][j] = 0;
            }
        }
    }

    public void realizarLance(Jogador jogador, int posicao) {

    }

    public boolean verificarGanhador(Jogador jogador) {
        return false;
    }

    public void exibirTabuleiro() {
        System.out.println("Tabuleiro:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.print(casas[i][j]);

                if (j < 2) {
                    System.out.print(" | ");
                }
            }

            System.out.println();

            if (i < 2) {
                System.out.println("--+---+--");
            }
        }
    }
}

