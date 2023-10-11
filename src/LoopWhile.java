import java.util.Scanner;

public class LoopWhile {
    public static void main(String[] args){
        Scanner leitor =  new Scanner(System.in);
        double avalia = 0;
        double media = 0;
        int opcao = 11;
        int rep = 0;

        while (opcao == 11) {
            System.out.println("Digite 11 para avaliar ou 12 para parar");
            opcao = leitor.nextInt();
            while(opcao != 11 && opcao != 12){
                System.out.println("Por favor digite 11 para avaliar ou 12 para parar!");
                opcao = leitor.nextInt();
            }
            if (opcao == 12){
                break;
            }
            System.out.println("Digite sua avaliação apra o filme ");
            double nota = leitor.nextDouble();
            avalia += nota;
            rep ++;
            media = avalia/rep;
        }
        System.out.println("A média das notas do filme foi de: "+media);
    }
}
