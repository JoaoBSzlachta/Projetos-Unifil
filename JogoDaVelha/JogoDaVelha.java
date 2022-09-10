package JogoDaVelha;

import Regras.VencedorRegra;
import Utils.ConsoleDisplay;

public class JogoDaVelha extends Estado {

    // Algumas propriedades declaradas no pai [Estado]

    public Character[][] jogar() {
        // enquanto jogadaAtual for menor que o maximo de jogadas
        while (jogadaAtual < maxJogadas) {
            Visual.clear();

            // printando o jogador atual
            ConsoleDisplay.printBr("");
            ConsoleDisplay.printBr("ℹ Jogador Atual: \"" + jogadorAtual + "\"" );

            // montando o Visual da Velha
            Visual.mount(this.velha);

            // se jogada nao for valida... pule o loop.
            // deste jeito o jogador nao perde a vez e o loop mantem a jogada atual
            if (!jogada()) {
                continue;
            }

            // checando ganhador
            VencedorRegra vencedorRegra = new VencedorRegra(velha);
            Character ganhador = vencedorRegra.checarRegra();
            // caso alguem tenha ganho
            if (ganhador != null) {
                // execute a funcao ganhou
                ganhou();
                // parando o loop
                return velha;
            }

            // avancando a jogada
            avancarJogada();
        }
        velha();

        return velha;
    }

    private void velha() {
        Visual.digiteEnter("[ \uD83D\uDC75 Deu Velha !!! ]");
    }

    private boolean jogada() {
        // try catch para prevenir erro de linha ou coluna fora da velha
        try {
            int linha = Visual.read("Digite a Linha para inserir");
            int coluna = Visual.read("Digite a Coluna para inserir");

            // caso casa ja esteja ocupada na velha
            if (velha[linha][coluna] != null) {
                Visual.digiteEnter("[ \uD83D\uDD12 Casa ocupada !!! ]");
                return false;
            }

            // colocando jogada do jogador atual na velha
            this.velha[linha][coluna] = jogadorAtual;
            // retornando true como retorno de sucesso da funcao
            return true;
        } catch (Exception e) {
            Visual.digiteEnter("[ ⚠️Linha ou coluna não existem nesta velha !!! ]");
        }

        return false;
    }

    private void ganhou() {
        Visual.mostrarGanhador(jogadorAtual);
        Visual.mount(velha);
    }
}
