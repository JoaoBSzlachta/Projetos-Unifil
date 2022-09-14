package Regras;

public class VencedorRegra {
    private final Character[][] velha;

    public VencedorRegra(Character[][] velha) {
        this.velha = velha;
    }

    // Metodo para checar regras, nele é feito a chamada de todas as regras contidas no jogo
    // Note o retorno, o console printa o valor retornado, que é o Character vencedor
    public Character checarRegra() {
        for (int linha = 0; linha < this.velha.length; linha++) {

            for (int coluna = 0; coluna < this.velha.length; coluna++) {
                // caso alguma checagem der verdadeira, retorne como true, ou seja, alguem ganhou
                Character horizonte = checarHorizontal(linha, coluna);
                if (horizonte != null) return horizonte;

                Character vertical = checarVertical(linha, coluna);
                if (vertical != null) return vertical;

                Character diagonal = checarDiagonal(linha, coluna);
                if (diagonal != null) return diagonal;
            }

        }

        return null;
    }

    // Metodo para checar DIAGONAIS no jogo
    private Character checarDiagonal(int linha, int coluna) {
        try {
            if (velha[linha - 1][coluna - 1].equals(velha[linha][coluna])
                    &&
                    velha[linha][coluna].equals(velha[linha + 1][coluna + 1]))
            {
                return velha[linha][coluna];
            }

            if (velha[linha + 1][coluna + 1].equals(velha[linha][coluna])
                    &&
                    velha[linha][coluna].equals(velha[linha - 1][coluna - 1]))
            {
                return velha[linha][coluna];
            }
        } catch (Exception $e) { }

        return null;
    }

    // Metodo para checar VERTICAIS no jogo
    private Character checarVertical(int linha, int coluna) {
        try {
            if ( velha[linha - 1][coluna].equals(velha[linha][coluna])
                    &&
                    velha[linha][coluna].equals(velha[linha + 1][coluna])) {
                return velha[linha][coluna];
            };
        } catch (Exception $e) { }
        return null;
    }

    // Metodo para checar HORIZONTAL no jogo
    private Character checarHorizontal(int linha, int coluna)
    {
        try {
            if (velha[linha][coluna -1].equals(velha[linha][coluna])
                    &&
                    velha[linha][coluna].equals(velha[linha][coluna + 1])) {
                return velha[linha][coluna];
            }
        } catch (Exception $e) {}
        return null;
    }
}
