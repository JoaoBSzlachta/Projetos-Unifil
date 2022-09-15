package Utils;

public class GerarEmpateVelha {
    // metodo que gera a velha automatica
    // colocando os valores necessarios para uma velha
    public static void gerar(Character[][] velha) {
        velha[0][0] = 'X';
        velha[0][1] = 'X';
        velha[0][2] = 'O';
        velha[1][0] = 'O';
        velha[1][1] = 'X';
        velha[1][2] = 'O';
        velha[2][0] = 'X';
        velha[2][1] = 'O';
        velha[2][2] = 'X';
    }
}
