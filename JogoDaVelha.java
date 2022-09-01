
import java.util.Scanner;

public class jogo_da_velha {

    static Scanner sc = new Scanner(System.in);

    static String[][] tabuleiro = new String[4][3];
    static int aux = 0, cont = 0;
    static int lin, col;
    static boolean won = false;

    public static void preencherTabuleiro(String[][] jogo) {
        for (int i = 0; i <= 2; i++) { // gerando o tabuleiro
            for (int j = 0; j <= 2; j++) {

                jogo[i][j] = " ";

            }
        }
    }

    public static void gerarTabuleiro(String[][] jogo) {

        for (int i = 0; i <= 2; i++) { // gerando o tabuleiro
            for (int j = 0; j <= 2; j++) {
                if (j == 2) {
                    System.out.println(jogo[i][j]);
                } else {
                    System.out.print(jogo[i][j] + " | ");
                }
            }
            System.out.println();
        }
    }

    public static void jogada() {
        if (aux == 0) { // 0 X joga

            System.out.print("LINHA: ");
            lin = sc.nextInt();
            System.out.print("COLUNA: ");
            col = sc.nextInt();

            while(validarJogada(tabuleiro[][]){
                tabuleiro[lin][col] = "X";
            }
            

            aux = 1;
            cont++;

        } else { // 1 O joga

            System.out.println("LINHA: ");
            lin = sc.nextInt();
            System.out.println("COLUNA: ");
            col = sc.nextInt();

            jogada[lin][col] = "O";

            aux = 0;
            cont++;
        }

    }

    public static boolean validarJogada(){
        if (tabuleiro[lin][col].equals("X") || tabuleiro[lin][col].equals("O")){
            System.out.println("LOCAL OCUPADO");
                return false;
        }
        return true;
    }

    public static void validarVitoria(String[][] validar){

    }

    public static void main(String[] args) {

        preencherTabuleiro(tabuleiro);

        while (won == false || cont < 9) {
            gerarTabuleiro(tabuleiro);
            jogada(tabuleiro);

        }

        // fazer jogadas ate 9 vezes ou ate ganha

    }

    // procedimento para preencher o tabuleiro

    // procedimento para atualizar a jogada

    // procedimento para printar o tabuleiro atualizado

    // procedimento para verificar se houve ganhador após a ultima jogada
}