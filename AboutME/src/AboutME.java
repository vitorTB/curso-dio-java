public class AboutME {

    public static void main(String[] args) {
    switchSemana();
    switchMes();
   }

    private static void switchSemana() {
        String dia = "terça";
        switch (dia) {
            case "segunda":
                System.out.println("é segunda");
                break;
            default:
                System.out.println("Não é um dia");
                break;
        }
    }
    private static void switchMes(){
        int mes = 1;
        switch (mes){
            case 1:
            case 2:
            case 3:
                System.out.println("É um numero 1-3");
                break;
            default:
                System.out.println("É um numero 4-10");
                break;

        }

    }

}





