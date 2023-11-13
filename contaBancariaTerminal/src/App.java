import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite sua agencia: ");
        String agencia = scanner.nextLine();
        System.out.print("Digite o número: ");
        int numero = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Saldo: ");
        double saldo = scanner.nextDouble();
        ContaTerminal contaTerminal = new ContaTerminal(agencia, numero, nome, saldo);
        System.out.println(contaTerminal);
        scanner.close();
    }
}
