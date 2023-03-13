package Estrutura.Arrays;

public class Ex01_OrdemInversa {
    public static void main(String[] args) {
        //arrya
        int[] vetor = {8, 5, 4, 9, 7, 10 };
        int count = 0;
        System.out.print("velor: ");
        while(count <= vetor.length -1){
            System.out.print(vetor[count] + " " );
            count++;
        }
        System.out.print("\nvetor: ");
            for (int i = vetor.length -1 ;i>=0; i--){
                System.out.print(vetor[i]+ " ");
            }




    }
}
