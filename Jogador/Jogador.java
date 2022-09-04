package Jogador;

import JogoDaVelha.JogoDaVelhaVisual;
import org.jetbrains.annotations.Nullable;

public class Jogador {
    protected @Nullable String nome;
    public String getNome() {
        return nome;
    }
    protected char skin;
    public char getSkin() {
        return skin;
    }

    public Jogador(char skin, @Nullable String nome) {
        this.skin = skin;
        this.nome = nome;
    }

    public int[] jogada()
    {
        int linha = JogoDaVelhaVisual.read("Linha: ");
        int coluna = JogoDaVelhaVisual.read("Coluna: ");

        return new int[]{linha, coluna};
    }

    @Override
    public String toString() {
        return "Jogador{" +
                "nome='" + nome + '\'' +
                ", skin=" + skin +
        '}';
    }
}
