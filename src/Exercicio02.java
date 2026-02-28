import java.util.Scanner;
public class Exercicio02 {
    public static void main (String [] args) {
        System.out.println("Digite um número: ");
        Scanner scan = new Scanner (System.in);
        double primeiroNumero = scan.nextDouble();
        System.out.println("Digite outro número");
        double segundoNumero = scan.nextDouble();
        System.out.println("Sua soma é:" +  (primeiroNumero + segundoNumero));
        System.out.println("Sua subtração é: " + (primeiroNumero - segundoNumero));
        System.out.println("Sua divisão é: " + (primeiroNumero / segundoNumero));
        System.out.println("Sua multiplicação é: " + (primeiroNumero * segundoNumero));
    }
}
