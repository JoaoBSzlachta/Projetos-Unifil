import JogoDaVelha.JogoDaVelha;
import JogoDaVelha.JogoDaVelhaVisual;

public class Main {
    public static void main(String[] args) {
        JogoDaVelha jogoDaVelha = new JogoDaVelha();
        boolean estado =  jogoDaVelha.jogar();

        if (!estado) {
            System.out.println("[ Deu Velha ]");
        }

        new JogoDaVelhaVisual(jogoDaVelha.velha).mountJogoDaVelha();

        return;
    }
}
