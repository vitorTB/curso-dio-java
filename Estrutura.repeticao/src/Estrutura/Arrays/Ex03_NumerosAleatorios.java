package Estrutura.Arrays;

import java.util.Random;
import java.util.Scanner;

public class Ex03_NumerosAleatorios {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int[] numerosAleatorios = new int[20];
        for (int i = 0; i < numerosAleatorios.length ; i++){
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }
        System.out.println("\n numero aleatorios: ");
        for (int numero : numerosAleatorios ) {
            System.out.print(numero + " ");
        }
        System.out.println("\n numero aleatorios + 1: ");
        for (int numero : numerosAleatorios ) {
            System.out.print((numero + 1 ) + " ");
        }
        System.out.println("\nNumeros aleatorios invertido");
        for (int i = numerosAleatorios.length -1 ;i>=0; i--){
            System.out.print(numerosAleatorios[i]+ " ");
        }







    }
}
