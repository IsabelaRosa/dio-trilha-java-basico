import java.util.Scanner;

public class ContaTerminal {
  public static void main(String[] args) throws Exception {
    Scanner scan = new Scanner(System.in);

    System.out.println("Seja bem vindo(a)!\n" +
      "Por favor, digite o número da sua conta:");
    Integer Numero =  Integer.parseInt(scan.nextLine());

    System.out.println("Digite sua agência:");
    String Agencia = scan.nextLine();

    System.out.println("Ótimo!\nPor gentileza, digite seu nome:");
    String NomeCliente = scan.nextLine();

    System.out.println("Por último, digite seu saldo:");
    Float Saldo = Float.parseFloat(scan.nextLine());
    scan.close();

    String SaidaFormatada = String.format(
      "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s,"
      + " conta %d e seu saldo de %.2f já está disponível para saque.", 
      NomeCliente, Agencia, Numero, Saldo);

    System.out.println(SaidaFormatada);
  }
}
