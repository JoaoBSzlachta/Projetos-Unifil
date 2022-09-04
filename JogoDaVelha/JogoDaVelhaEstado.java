package JogoDaVelha;

import Jogador.Jogador;
import Jogador.JogoDaVelhaJogador;
import Velha.Velha;

abstract class JogoDaVelhaEstado {
    protected Velha velha;
    protected JogoDaVelhaJogador[] jogadores;
    private int jogadorAtualIndex = 0;
    private int maxJogadas = 9;
    private int contadorJogadas = 0;

    public JogoDaVelhaEstado(Jogador[] jogadores, Velha velha) {
        this.velha = velha;

        this.jogadores = new JogoDaVelhaJogador[jogadores.length];

        for (int i = 0; i < jogadores.length; i++) {
            this.jogadores[i] = new JogoDaVelhaJogador(velha, jogadores[i].getSkin(), jogadores[i].getNome());
        }
    }

    public Velha getVelha() {
        return velha;
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    protected JogoDaVelhaJogador jogadorAtual() {
        return jogadores[jogadorAtualIndex];
    }

    protected boolean avancarJogada() {
        // se jogadorAtual + 1 ultrapassar o tamanho do array de jogadores
        if (jogadorAtualIndex + 1 >= jogadores.length) {
            jogadorAtualIndex = 0;
            return contadorJogadas < maxJogadas;
        }

        ++jogadorAtualIndex;
        ++contadorJogadas;

        return contadorJogadas < maxJogadas;
    }
}
