import java.util.Scanner;


public class contaTerminal {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
    
    int numero;
    int agencia;
    String nomeCliente;
    double saldo;
    

    System.out.print("Digite o agencia: ");
    agencia = scanner.nextInt();

    System.out.print("Digite o numero da conta: ");
        numero = scanner.nextInt();
    
    System.out.print("Digite o nome: ");
        nomeCliente = scanner.next();
        
    System.out.print("Seu saldo e: ");
        saldo = scanner.nextDouble();


    System.out.println("Olá " + nomeCliente + " Seja bem vindo ");
    System.out.println("Obrigado por criar uma conta em nosso banco ");
    System.out.println("Sua agência é " + agencia + ", e o numero de sua conta e " + numero);
    System.out.println("E seu saldo no valor de " + saldo + ", já está disponível para saque.");


scanner.close();

    }
}
    