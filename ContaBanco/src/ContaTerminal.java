import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {

        String agencia = "067-8";
        Double saldo = 237.48;

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        // Exibir as mensagens para o nosso usuario
        System.out.println("Seja bem vindo ao nosso banco");

        // obter pela scanner os valores digitados no terminal
        System.out.println("Digite seu nome:");
        String nomeCliente = sc.next();

        System.out.println("Por favor, digite o número da Agência !");
        Integer numero = sc.nextInt();
        sc.nextLine();

        sc.close();

        // Exibir a mensagem conta criada
        System.out.println("----------------------------------------------------");
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
