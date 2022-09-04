package Regras;

import Velha.Velha;

public class JogoDaVelhaVencedorRegra implements Regra {
    private final Velha velha;

    public JogoDaVelhaVencedorRegra(Velha velha) {
        this.velha = velha;
    }

    @Override
    public boolean checarRegra() {
        for (int linha = 0; linha < velha.getVelha().length; linha++) {

            for (int coluna = 0; coluna < velha.getVelha().length; coluna++) {
                if (checarHorizontal(linha, coluna)) return true;
                if (checarVertical(linha, coluna)) return true;
                if (checarDiagonal(linha, coluna)) return true;
            }
        }

        return false;
    }

    private boolean checarDiagonal(int linha, int coluna) {
        try {
            if (velha.casa(linha - 1, coluna - 1).equals(velha.casa(linha, coluna))
                    &&
                    velha.casa(linha, coluna).equals(velha.casa(linha + 1, coluna + 1)))
            {
                return true;
            }

            if (velha.casa(linha + 1, coluna + 1).equals(velha.casa(linha, coluna))
                    &&
                    velha.casa(linha, coluna).equals(velha.casa(linha - 1, coluna - 1)))
            {
                return true;
            }
        } catch (Exception $e) {
            return false;
        }

        return false;
    }

    private boolean checarVertical(int linha, int coluna) {
        try {
            return velha.casa(linha - 1, coluna).equals(velha.casa(linha, coluna))
                    &&
                    velha.casa(linha, coluna).equals(velha.casa(linha + 1, coluna));
        } catch (Exception $e) {
            return false;
        }
    }

    private boolean checarHorizontal(int linha, int coluna)
    {
        try {
            return velha.casa(linha, coluna -1).equals(velha.casa(linha, coluna))
                    &&
                    velha.casa(linha, coluna).equals(velha.casa(linha, coluna + 1));
        } catch (Exception $e) {
            return false;
        }
    }
}
