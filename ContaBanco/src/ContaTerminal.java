import java.util.Scanner;

public class ContaTerminal {
  static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {

        //Número da conta
        System.out.print("Digite o Número da Conta: ");
        int conta = teclado.nextInt();

        //Número Agencia
        System.out.print("Digite a Agencia: ");
        String agencia = teclado.next();

        //Nome do cliente
        System.out.print("Nome do Cliente: ");
        String cliente = teclado.next();

        //Valor que tem bna conta
        System.out.print("Saldo da Conta: ");
        double saldo = teclado.nextDouble();

        System.out.println("Olá "+cliente+ ", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+
                "\n , conta "+conta+ " e seu saldo "+saldo+ " já está disponível para saque.");


    }
}
