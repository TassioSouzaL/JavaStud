import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int conta = 1021;
        var Agencia = "067-8";
        var NomeCliente = "Mario Andrade ";
        Double Saldo = 237.48;
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta: ");
        int Conta = sc.nextInt();
        if (Conta == conta) {
            System.out.println("Olá " + NomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " +
                    Agencia + " Conta " + conta + " e seu Saldo é R$" + Saldo + " Já disponível para saque.");
        }
    }
}
