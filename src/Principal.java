import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a operação desejada: SOMA, SUBTRACAO, DIVISAO ou MULTIPLICACAO");
        String operacao;

        operacao = scanner.nextLine();

        System.out.println("Informe o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.println("Informe o segundo número: ");
        double num2 = scanner.nextDouble();

        OperacaoMatematica operacaoMatematica = null;
        operacaoMatematica = operacaoMatematica.valueOf(operacao.toUpperCase());

        switch (operacaoMatematica) {
            case SOMA:
                System.out.println("Resultado: " + (num1 + num2));
                break;
            case SUBTRACAO:
                System.out.println("Resultado: " +(num1 - num2));
                break;
            case DIVISAO:
                System.out.println("Resultado: " +(num1 / num2));
                break;
            case MULTIPLICACAO:
                System.out.println("Resultado: " +(num1 * num2));
                break;
            default:
                System.out.println("Operacao inválida. Entre com SOMA, SUBTRACAO, DIVISAO ou MULTIPLIACAO");
                break;
        }

    }
}
