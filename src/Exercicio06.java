import java.util.Scanner;
public class Exercicio06 {
    public static void main (String [] args) {
        System.out.println("Digite sua primeira nota: ");
        Scanner scan = new Scanner (System.in);
        double primeiraNota = scan.nextDouble();
        System.out.println("Digite sua segunda nota: ");
        double segundaNota = scan.nextDouble();
        System.out.println("Digite sua terceira nota: ");
        double terceiraNota = scan.nextDouble();
        double mediaFinal = ((2 * primeiraNota) + (3 * segundaNota) + (5 * terceiraNota)) / 10;
        System.out.println("Sua média final é: " + mediaFinal);
    }
}
