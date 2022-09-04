package JogoDaVelha;

import Jogador.Jogador;
import Utils.ConsoleDisplay;
import Velha.Velha;

public class JogoDaVelha extends JogoDaVelhaEstado {

    public JogoDaVelha(Jogador[] jogadores, Velha velha) {
        super(jogadores, velha);
    }

    public boolean jogar() {
        while (avancarJogada()) {
            ConsoleDisplay.printBr("[ Jogador Atual: " + jogadorAtual().getSkin() + " ]" );

            new JogoDaVelhaVisual(velha).mount();

            // se jogada for valida, continue o loop
            // if (jogadorAtual().jogada() != null) jogadas++;
            int[] linhaColuna = jogadorAtual().jogada();
            if (linhaColuna == null) continue;
            else {
                velha.put(linhaColuna[0], linhaColuna[1], jogadorAtual().getSkin());
            }

            // checando ganhador
            if (velha.checarVencedor()) {
                new JogoDaVelhaVisual(velha).mostrarGanhador();
                return true;
            }
        }

        return false;
    }
}
