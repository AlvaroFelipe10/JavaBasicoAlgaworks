import java.util.Scanner;

public class CalculaMedia {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = entrada.nextLine();

        System.out.print("Nota prova 1? :");
        int nota1 = entrada.nextInt();

        System.out.print("Nota prova 2? :");
        int nota2 = entrada.nextInt();

        System.out.print("Nota Prova 3? :");
        int nota3 = entrada.nextInt();

        int notaTotal = (nota1 + nota2 + nota3) /3;
        System.out.println("Sua nota foi " + notaTotal);

        if(notaTotal < 70){
            System.out.println("Voce foi reprovado! :( ");
        } else if (notaTotal > 70 ){
            System.out.println("Voce foi aprovado!  ");
        } else if (notaTotal == 100){
            System.out.println("Parabens você tirou nota maxima");
        }
    }
}
