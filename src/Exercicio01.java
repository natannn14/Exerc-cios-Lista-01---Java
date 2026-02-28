import java.util.Scanner;
public class Exercicio01 {
    public static void main (String[] args) {
        System.out.println("Digite seu nome: ");
        Scanner scan = new Scanner(System.in);
        String nome = scan.nextLine();
        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scan.nextLine();
        System.out.println("Seu nome completo é: " + nome + " " + sobrenome);
    }
}
