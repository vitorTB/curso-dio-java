package Estrutura.Arrays;

import java.util.Random;

public class Ex04_ArryMultiDimensional {
    public static void main(String[] args) {
        Random random = new Random();
    int[][] M = new int[4][4];

    for (int i = 0 ; i < M.length ; i++){
        for (int j = 0 ; j < M[i].length; j ++){
            M[i][j] = random.nextInt(9);
        }
    }
        for (int i = 0 ; i < M.length ; i++){
            for (int j = 0 ; j < M[i].length; j ++){
                if(M[i][j] == 2){
                    M[i][j] = 9;
                }
            }

        }

        for ( int[] linha : M ) {
            for ( int coluna : linha ) {
                System.out.print(coluna + " ");
            }
            System.out.println();
        }








    }
}
