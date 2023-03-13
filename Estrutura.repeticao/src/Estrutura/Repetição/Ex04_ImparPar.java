package Estrutura.Repetição;

import java.util.Scanner;

public class Ex04_ImparPar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int quantidadeNumero = 0;
        int count = 0;
        int numero = 0;
        int contadorPAR=0, contadorImpar = 0 ;
        System.out.println("Digite uma qtd de numero: ");
        quantidadeNumero = scan.nextInt();
        do {
            System.out.println("Digite um numero: ");
            numero = scan.nextInt();

            if (numero % 2 == 0){
                System.out.println("par");
                contadorPAR++;
            }else{
                System.out.println("impar");
                contadorImpar++;
            }
            count++;
        }while (count<quantidadeNumero);

        System.out.println("Quantidade de par: " + contadorPAR);
        System.out.println("Quantidade de impar: " + contadorImpar);



    }





}
