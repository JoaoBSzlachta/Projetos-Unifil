package JogoDaVelha;

abstract class Estado {

    // Character é um String... só q nao é, mas é
    protected Character[][] velha = new Character[3][3];
    protected Character jogadorAtual = 'X';
    protected int maxJogadas = 9;
    protected int jogadaAtual = 0;

    protected void avancarJogada() {
        // fazendo troca de jogadores
        if (jogadorAtual == 'X') {
            jogadorAtual = '0';
        } else {
            jogadorAtual = 'X';
        }

        ++jogadaAtual;
    }
}
