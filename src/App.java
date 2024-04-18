import java.util.Scanner;

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

    }
}
