import Jogador.Jogador;
import JogoDaVelha.JogoDaVelha;
import JogoDaVelha.JogoDaVelhaVisual;
import Velha.Velha;

public class Main {
    public static void main(String[] args) {
        Jogador[] jogadores = new Jogador[]{
                new Jogador('X', null),
                new Jogador('O', null),
        };

        JogoDaVelha jogoDaVelha = new JogoDaVelha(jogadores, new Velha(3, 3));

        boolean estado = jogoDaVelha.jogar();

        if (!estado) {
            System.out.println("[ Deu Velha ]");
        }
    }
}
