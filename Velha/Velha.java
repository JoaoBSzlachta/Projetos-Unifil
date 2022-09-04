package Velha;

import Regras.JogoDaVelhaVencedorRegra;
import org.jetbrains.annotations.Nullable;

public class Velha {
    private Character[][] velha;

    public Velha(int tamanhoX, int tamanhoY) {
        this.velha = new Character[tamanhoX][tamanhoY];
    }

    public Character[][] getVelha() {
        return velha;
    }

    public @Nullable Character casa(int linha, int coluna) {
        return this.velha[linha][coluna];
    }

    public void put(int linha, int coluna, char valor) {
        this.velha[linha][coluna] = valor;
    }

    public boolean checarVencedor() {
        JogoDaVelhaVencedorRegra regra = new JogoDaVelhaVencedorRegra(this);

        return regra.checarRegra();
    }
}
