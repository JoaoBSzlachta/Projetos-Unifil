package Jogador;

import Utils.ConsoleDisplay;
import Velha.Velha;
import org.jetbrains.annotations.Nullable;

public class JogoDaVelhaJogador extends Jogador {
    private final Velha velha;

    public JogoDaVelhaJogador(Velha velha, char skin, @Nullable String nome) {
        super(skin, nome);
        this.velha = velha;
    }

    @Override
    public int[] jogada() {
        int[] linhaColuna = super.jogada();
        int linha = linhaColuna[0];
        int coluna = linhaColuna[1];

        try {
            // caso, casa ja esteja ocupada
            if (casaOcupada(velha.casa(linhaColuna[0], linhaColuna[1]))) {
                ConsoleDisplay.printBr("Casa Ocupada !!!");
                return null;
            }
        } catch (Exception $e) {
            ConsoleDisplay.printBr("[ Houve um erro, provavelmente as casas estao fora do index permitido ]");
            return null;
        }

        return linhaColuna;
    }

    private boolean casaOcupada(@Nullable Character casa) {
        // se casa estiver ocupada
        return casa != null;
    }
}
