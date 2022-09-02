package JogoDaVelha;

import Utils.ConsoleDisplay;

// @todo muitas coisas :)
public class JogoDaVelha {
    public String[][] velha = new String[3][3];
    protected boolean won = false;
    protected String jogador = "X";
    protected int maxJogadas = 9;
    protected int jogadas = 0;
    protected ConsoleDisplay cD = new ConsoleDisplay();

    public boolean jogar() {
        // enquanto nao houver vencedor e num de jogadas n superar o max de jogadas permitido
        while (!won && jogadas < maxJogadas) {
            cD.printBr("[ Jogador Atual: " + jogador + " ]");
            new JogoDaVelhaVisual(velha).mountJogoDaVelha();

            // se jogada for valida, continue o loop
            if (jogada()) jogadas++;

            // checando ganhador
            if (checarGanhador()) {
                new JogoDaVelhaVisual(velha).mostrarGanhador();
                return true;
            }
        }
        return false;
        //new JogoDaVelhaVisual(velha).mountJogoDaVelha();
    }

    private boolean jogada() {
        int linha = JogoDaVelhaVisual.read("Linha: ");
        int coluna = JogoDaVelhaVisual.read("Coluna: ");

        // gravando jogada de acordo com o jogador
        try {
            // caso, casa ja esteja ocupada
            if (casaOcupada(velha[linha][coluna])) {
                cD.printBr("Casa Ocupada !!!");
                return false;
            }

            if (jogador.equals("X")) {
                velha[linha][coluna] = jogador;
                // alternando jogadores
                jogador = "O";
            }
            else if (jogador.equals("O")) {
                velha[linha][coluna] = jogador;
                // alternando jogadores
                jogador = "X";
            }
        } catch (Exception $e) {
            cD.printBr("[ Houve um erro, provavelmente as casas estao fora do index permitido ]");
            return false;
        }

        return true;
    }

    private boolean casaOcupada(String casa) {
        // se casa estiver ocupada
        return casa != null;
    }

    private boolean checarGanhador() {
        // foreach linha
        for (int i = 0; i < velha.length; i++) {
            try {
                checarCruz();
                checarLinha(i);
                checarColuna();
            } catch (Exception $e) { }
        }

        return won;
    }

    private void checarCruz() {
        // \
        if (
            ((velha[0][0] != null && velha[1][1] != null && velha[2][2] != null))
            &&
            ((velha[0][0].equals(velha[1][1]) && velha[1][1].equals(velha[2][2])))
        ) {
            won = true;
        }

        // |
        if (
                ((velha[0][1] != null && velha[1][1] != null && velha[2][1] != null))
                        &&
                ((velha[0][1].equals(velha[1][1]) && velha[1][1].equals(velha[2][1])))
        ) {
            won = true;
        }

        // /
        if (
                ((velha[0][2] != null && velha[1][1] != null && velha[2][0] != null))
                &&
                ((velha[0][2].equals(velha[1][1]) && velha[1][1].equals(velha[2][0])))
        ) {
            won = true;
        }
    }

    private void checarColuna() {
        if (
                (velha[0][0].equals(velha[1][0]) && velha[1][0].equals(velha[2][0]))
        ) {
            won = true;
        }
    }

    private void checarLinha(int i) {
        // linha
        if (
                (velha[i][0].equals(velha[i][1]) && velha[i][1].equals(velha[i][2]))
        ) {
            won = true;
        }
    }
}
