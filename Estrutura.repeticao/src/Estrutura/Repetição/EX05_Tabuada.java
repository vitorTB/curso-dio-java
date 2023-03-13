package Estrutura.Repetição;

import java.util.Scanner;

public class EX05_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tabuada;
        System.out.println("Digite a tabuada que deseja: ");
        tabuada = scan.nextInt();

        for (int i = 0 ;i <= 10 ;i++){
            System.out.println(tabuada + " X " + i + " = " + (tabuada*i));
        }
    }


}
