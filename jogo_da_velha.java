
import java.util.Scanner;

public class jogo_da_velha {

    static Scanner sc = new Scanner(System.in);

    static String [][] tabuleiro = new String[4][4];
    static int aux = 0, cont = 0;
    static int lin, col;
    static boolean won = false;

    

    public static void preencherTabuleiro(String[][] jogo){
        for(int i = 0; i <= 2; i++ ){ //gerando o tabuleiro
            for (int j = 0; j <= 2; j++){

                jogo[i][j] = " ";

            }
        }
    }

    public static void gerarTabuleiro(String[][] jogo) {
    
        for(int i = 0; i <= 2; i++){ //gerando o tabuleiro
            for (int j = 0; j <= 1; j++){
                System.out.print(jogo[i][j] + " | ");
            }
            System.out.println();
            for (int j = 0; j <= 2; j++){
                System.out.print(jogo[i][j] + " --- ");
            }
            System.out.println();
        }
    }

    public static void jogada (String[][] jogada){
        if(aux == 0){ // 0 X joga

            System.out.print("LINHA: ");
            lin = sc.nextInt();
            System.out.print("COLUNA: ");
            col = sc.nextInt();

            jogada[lin][col] = "X";

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

    public static void main(String[] args) {
        
        preencherTabuleiro(tabuleiro);

        while(won == false || cont < 9){
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