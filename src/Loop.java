import java.security.SignedObject;
import java.util.Scanner;

public class Loop {
    public static void main(String[] args){
        Scanner leitor =  new Scanner(System.in);
        double avalia = 0;
        double media = 0;

        for (int i = 1; i <=3 ; i++) {
            System.out.println("Digite sua avaliação apra o filme ");
            double nota = leitor.nextDouble();
            avalia = avalia +nota;
            media = avalia/i;
        }
        System.out.println("A média das notas do filme foi de: "+media);
    }
}
