package JogoDaVelha;

public class JogoDaVelha {
    protected String[][] velha = new String[3][3];
    protected boolean won = false;
    protected boolean jogador = false;
    protected int maxJogadas = 9;
    protected int jogadas = 0;

    public JogoDaVelha() {
        // enquanto nao houver vencedor e num de jogadas n superar o max de jogadas permitido
        while (!won || jogadas < maxJogadas) {
            new JogoDaVelhaVisual(velha).mountJogoDaVelha();

            // se jogada for valida, continue o loop
            if (jogada()) jogadas++;

            // checando ganhador
            checarGanhador();
        }
    }

    private boolean jogada() {
        int linha = JogoDaVelhaVisual.read("Linha: ");
        int coluna = JogoDaVelhaVisual.read("Coluna: ");

        // caso, casa ja esteja ocupada
        if (casaOcupada(velha[linha][coluna])) {
            JogoDaVelhaVisual.printBr("Casa Ocupada !!!");
            return false;
        }

        // gravando jogada de acordo com o jogador
        if (jogador) {
            velha[linha][coluna] = "X";
        } else {
            velha[linha][coluna] = "O";
        }
        // alternando jogadores
        jogador = !jogador;

        return true;
    }

    private boolean casaOcupada(String casa) {
        // se casa estiver ocupada
        return casa != null;
    }

    private boolean checarGanhador() {
        boolean is = false;
        for (int i = 0; i < velha.length; i++) {
            if (velha[i][0] == velha[i][1] && velha[i][1] == velha[i][2] && jogadas > 1) {
              won = true;
            }
            //for (int j = 0; j < velha.length; j++) {
            //}
        }

        return won;
    }
}
