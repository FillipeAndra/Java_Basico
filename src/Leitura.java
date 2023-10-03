import java.util.Scanner;
public class Leitura {

    public static void main (String[] args){
        Scanner leitor =  new Scanner(System.in);
        System.out.println("Digite seu filme favorito");
        String favorito;
        int ano;
        double avalia;
        favorito = leitor.nextLine();
        System.out.println("Digite o ano de lançamento");
        ano = leitor.nextInt();
        System.out.println("Digite sua avaliação desse filme até 5 estrelas");
        avalia = leitor.nextDouble();
        System.out.println("Nome do filme favorito: "+favorito);
        System.out.println("Ano de lançamento: "+ano);
        System.out.println("a avaliação foi de: "+avalia);
    }
}
