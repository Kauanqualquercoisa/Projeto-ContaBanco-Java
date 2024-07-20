import java.util.Scanner;

   public class ContaTerminal {
    // Roteiro de implementação do programa
//TO-DO: Conhecer e Importar a classe Scanner
//Exibir as mensagens para o usuário
//Obter pelo Scanner os valores digitados pelo usuário
//Exibir as informações lidas
public static void main(String[] args) {
    
    Scanner scanneia = new Scanner(System.in);

System.out.println("Insira seus dados bancários e de identidade: ");
System.out.println(" ");

System.out.println("Seu nome: ");
  String nome = scanneia.next();

System.out.println("Seu sobrenome: ");
  String sobrenome = scanneia.next();

System.out.println("Numero da agencia - exemplo: 012-3");
  String agencia = scanneia.next();

System.out.println("Numero da Conta - exemplo: 0123");
 int conta = scanneia.nextInt();

System.out.println("Seu saldo: ");
 double saldo = scanneia.nextDouble();

 System.out.print("Olá " + nome + " " + sobrenome);
 System.out.print(", obrigado por criar uma conta em nosso banco,");
 System.out.print(" sua agência é " + agencia);
 System.out.print(", conta " + conta);
 System.out.println(" e seu saldo de " + saldo + "R$ já está disponível para saque");

 scanneia.close();
 }
}
