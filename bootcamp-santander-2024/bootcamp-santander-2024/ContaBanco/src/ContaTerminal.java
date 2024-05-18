import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

    
        String nomeCliente;
        System.out.println("\nPor favor, digite o seu nome completo: ");
        do {
            nomeCliente = scanner.nextLine();
            // Verifica se o nome do cliente é válido.
            if (!nomeCliente.matches("[a-zA-Z\\s]+")) {
                System.out.printf("\nNome inválido. Digite um nome contendo apenas letras e espaços: ");
            }
        } while (!nomeCliente.matches("[a-zA-Z\\s]+"));


        String agencia;
        System.out.println("\nPor favor, digite a agência com dígito: ");
        do {
            agencia = scanner.next();
            // Verifica se a agência é válida.
            if (!agencia.matches("[0-9]+-?[0-9]*")) {
                System.out.printf("\nAgência inválida. Digite uma agência contendo apenas números e o dígito separador - : ");
            }
        } while (!agencia.matches("[0-9]+-?[0-9]*"));


        int numero;
        System.out.println("\nPor favor, digite o numero da conta: ");
        // Verifica se a conta é válida.
        while (!scanner.hasNextInt()) {
            System.out.printf("\nNúmero da conta inválido. Digite uma conta contendo apenas números: ");
            scanner.next();
        }
        numero = scanner.nextInt();


        double saldo;
        System.out.println("\nPor favor, digite o seu saldo atual: ");
        // Verifica se o saldo é válida.
        while (true) {
            if (scanner.hasNextDouble()) {
                saldo = scanner.nextDouble();
                if (saldo >=0 ) {
                    break;
                } else {
                    System.out.printf("\nSaldo inválido. Não podemos abrir uma conta com saldo negativo. Insira um valor maior ou igual a 0: ");
                    scanner.nextLine();
                }
            } else {
                System.out.printf("\nSaldo inválido. Digite um saldo utilizando o separador decimal padrão de sua localidade: ");
                scanner.nextLine();
            }       
        }

        System.out.printf("\nOlá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo de Thay%.2f já está disponível para saque.%n", nomeCliente, agencia, numero, saldo);
        
        scanner.close();
    }
}