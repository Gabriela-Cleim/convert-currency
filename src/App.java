import java.util.Scanner;

/*
 *Conversor de Moeda: Escreva um programa que converta uma quantia em uma moeda para 
 *outra moeda (por exemplo, euros, libras, ienes) com base em 
 *uma taxa de câmbio fornecida pelo usuário.
 */


public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome da moeda. Ex: Dolar, Thai Baht");
        String currencyName = scanner.next();

        System.out.println("Digite o valor da taxa: ");
        double currencyFee = scanner.nextDouble();

        System.out.println("Digite o valor para ser convertido: ");
        double currencyValue = scanner.nextDouble();

        double result = currencyValue * currencyFee;
        System.out.println("O valor convertido para o moeda escolhida é: " + result);

        scanner.close();

    }
}
