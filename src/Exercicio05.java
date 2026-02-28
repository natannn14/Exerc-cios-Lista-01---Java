import java.util.Scanner;
public class Exercicio05 {
    public static void main (String[] args) {
        System.out.println("Digite sua idade em dias: ");
        Scanner scan = new Scanner (System.in);
        int idadeDias = scan.nextInt();
        int idadeAnos = idadeDias / 365;
        int idadeResto = idadeDias % 365;
        int idadeMeses = idadeResto / 30;
        int diasFinais = idadeResto % 30;
         System.out.println("Sua idade em anos é: " + idadeAnos + " anos " +
                 "Sua idade em meses é: " + idadeMeses + " meses " +
                 "Sua idade em dias é: " + diasFinais + " dias");
    }
}
