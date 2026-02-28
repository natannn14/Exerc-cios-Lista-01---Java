import java.util.Scanner;
public class Exercicio03 {
    public static void main (String[] args) {
        System.out.println("Digite um número: ");
        Scanner scan = new Scanner(System.in);
        double primeiroNumero = scan.nextDouble();
        System.out.println("Digite outro número: ");
        double segundoNumero = scan.nextDouble();
        System.out.println("Seus números antes da troca são: A = "
                + primeiroNumero + " e B = " + segundoNumero);
        double trocaVariaveis = primeiroNumero;
        primeiroNumero = segundoNumero;
        segundoNumero = trocaVariaveis;
        System.out.println("Seus números depois da troca são: A = "
                + primeiroNumero + " e B = " + segundoNumero);
    }
}
