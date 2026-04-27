
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

    public int[] getPosicao(String coordenada) {
        char coluna = coordenada.charAt(0);
        char linha = coordenada.charAt(1);

        int x = coluna - 'A';
        int y = linha - '1';

        return new int[]{x, y};
    }

    public void realizarLance(Jogador jogador, int posicao) {

    }

    public int verificarGanhador(Jogador jogador, String coordenada) {
        int[] pos = getPosicao(coordenada);
        int x = pos[0];
        int y = pos[1];

        if (MatrizFunctions.sumLinha(casas, x) == 3) {
            return 1;
        } else if (MatrizFunctions.sumLinha(casas, x) == 6) {
            return 2;
        }

        if (MatrizFunctions.sumColuna(casas, y) == 3) {
            return 1;
        } else if (MatrizFunctions.sumColuna(casas, y) == 6) {
            return 2;
        }

        if (MatrizFunctions.sumMainDiagonal(casas) == 3) {
            return 1;
        } else if (MatrizFunctions.sumMainDiagonal(casas) == 6) {
            return 2;
        }

        if (MatrizFunctions.sumSecDiagonal(casas) == 3) {
            return 1;
        } else if (MatrizFunctions.sumSecDiagonal(casas) == 6) {
            return 2;
        }

        return 0;
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
