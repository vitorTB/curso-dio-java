package Estrutura.Repetição;

import java.util.Scanner;

public class Ex03_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int armazenamento = 0;
        int contador = 0;
        int media = 0;


        do{
            System.out.print("numero: ");
            numero = scan.nextInt();
            contador++;

            if(maior<numero)
                maior = numero;
            armazenamento = armazenamento + numero;

        }while (contador < 5 );

        media = armazenamento/5;

        System.out.println("A média dos numeros é: " + media);
        System.out.println("O maior numero é: "+ maior);

        }
}
