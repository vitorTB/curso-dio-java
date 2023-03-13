package Estrutura.Repetição;

import java.util.Scanner;

public class Ex02_Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nota;

        System.out.println("Nota: ");
        nota = scan.nextInt();
            if(nota == 6){
            System.out.println("passou de raspão");
        }
        while (nota<0 || nota > 10) {
            System.out.println("nota invalida");
            System.out.print("Diga nova nota:");
            nota = scan.nextInt();

        }
    }
}
