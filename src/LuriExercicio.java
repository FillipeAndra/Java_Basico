import java.util.Scanner;
public class LuriExercicio {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        double nota = 0;
        double soma = 0;
        int repet = 0;

        while(nota != -1){
            System.out.println("Por favor digite uma nota ou -1 para parar");
            nota = leitor.nextDouble();
            if (nota == -1) {
                nota = 0;
                break;
            }
            soma += nota;
            repet++;
        }
        System.out.println("A média das nots foi de: "+soma/repet);
    }
}
