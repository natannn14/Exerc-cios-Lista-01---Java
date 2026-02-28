import java.util.Scanner;
public class Exercicio04 {
    public static void main (String [] args) {
        System.out.println("Digite quantos anos você tem: ");
        Scanner scan = new Scanner (System.in);
        int idadeAnos = scan.nextInt();
        System.out.println("Digite quantos meses você tem: ");
        int idadeMeses = scan.nextInt();
        System.out.println("Digite quantos dias você tem: ");
        int idadeDias = scan.nextInt();
        int totalDias = (idadeAnos * 365) + (idadeMeses * 30) + idadeDias;
        System.out.println("Sua idade em dias é: " + totalDias);
    }
}
