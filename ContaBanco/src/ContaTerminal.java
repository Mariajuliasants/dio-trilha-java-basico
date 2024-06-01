import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) {
        
         Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência ");
        int numero = scanner.nextInt(); 

         scanner.nextLine();

        System.out.println("Por favor, Digite a Agência ");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, Digite o Seu Nome ");
        String nomeCliente =scanner.nextLine() ;

        System.out.println("Por favor, Digite o Saldo ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá "+nomeCliente+",obrigado por criar uma conta em nosso banco, sua agência é "
        +agencia+", conta " +numero+ " e seu saldo "+saldo+ " já está disponível para saque");

        scanner.close();
    }
}
