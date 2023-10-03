// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Condicional {
    public static void main(String[] args) {
       int anoDeLancamento = 2022;
       boolean incluzoNoPlano = true;
       double notaDoFilme = 8.1;
       String tipoPlano = "Plus";

       if (anoDeLancamento<2005){
           String idade = "retrô";
           System.out.println("Este filme é retrô\n");
       }else if(anoDeLancamento >= 2023){
           String idade = "lançamento";
           System.out.println("Este filme é um recém lançado\n");
       }else{
           String idade = "recente";
           System.out.println("Este filme é recente\n");
       }

       if(incluzoNoPlano == true || tipoPlano.equals("Plus")){
           System.out.println("Filme liberado");
       }else{
           System.out.println("Filme bloqueado, por favor, ou alugue-o \nou assine um plano mais elevado");
       }
    }
}