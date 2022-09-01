import JogoDaVelha.JogoDaVelhaVisual;

public class Main {
    public static void main(String[] args) {
        String[][] string = new String[3][3];

        JogoDaVelhaVisual visual = new JogoDaVelhaVisual(string);
        visual.mountJogoDaVelha();
    }
}
