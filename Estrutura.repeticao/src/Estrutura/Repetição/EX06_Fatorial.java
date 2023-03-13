package Estrutura.Repetição;

import java.util.Scanner;

public class EX06_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 5 - 4 -3 -2 -1
        int fatorial;
        int soma = 1;
        System.out.print("digite fatorial: ");
        fatorial = scan.nextInt();
        for (int i = fatorial ; i >= 1 ; i--){
            soma = soma * i;

        }
        System.out.println(soma);
    }
}
