
import java.util.Scanner;

public class jogo_da_velha {

    static Scanner sc = new Scanner(System.in);

    static String [][] tabuleiro = new String[5][5];
    static int aux = 0;
    static int lin, col;
    String jogada = "";
    

    public static void preencherTabuleiro(String[][] jogo){
        for(int i = 0; i <= 4; i++ ){ //gerando o tabuleiro
            for (int j = 0; j <= 4; j++){

                jogo[i][j] = " ";

            }
        }
    }

    public static void gerarTabuleiro(String[][] jogo) {
    
        for(int i = 0; i <= 4; i++){ //gerando o tabuleiro
            for (int j = 0; j <= 3; j++){
                System.out.print(jogo[i][j] + " | ");
            }
            System.out.println();
        }
    }

    public static void jogada (String[][] jogada){

        if(aux == 0){ // 0 X joga

            System.out.println("LINHA: ");
            lin = sc.nextInt();
            System.out.println("COLUNA: ");
            col = sc.nextInt();

            jogada[lin][col] = "X";

            aux = 1;

        } else { // 1 O joga

            System.out.println("LINHA: ");
            lin = sc.nextInt();
            System.out.println("COLUNA: ");
            col = sc.nextInt();

            jogada[lin][col] = "O";

            aux = 0;
        }

    }

    public static void main(String[] args) {
        

        String j1 = "O";
        String j2 = "X";
        boolean won = false;

        preencherTabuleiro(tabuleiro);
       
        jogada(tabuleiro);
        gerarTabuleiro(tabuleiro);

        
    }


    // procedimento para preencher o tabuleiro

    // procedimento para atualizar a jogada

    // procedimento para printar o tabuleiro atualizado

    // procedimento para verificar se houve ganhador após a ultima jogada
}
