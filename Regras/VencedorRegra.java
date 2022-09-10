package Regras;

public class VencedorRegra {
    private final Character[][] velha;

    public VencedorRegra(Character[][] velha) {
        this.velha = velha;
    }

    public Character checarRegra() {
        for (int linha = 0; linha < this.velha.length; linha++) {

            for (int coluna = 0; coluna < this.velha.length; coluna++) {
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
