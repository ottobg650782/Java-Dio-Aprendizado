import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int count = 0;
        int quantidade = 5;
        float media = 0;
        int soma = 0;
        do {
            System.out.println("Insira o número: ");
            numero = scan.nextInt();
            soma = soma + numero;
            if (numero > maior)
                maior = numero;

            count = count + 1;

        } while (count < quantidade);
        System.out.println("Maior: " + maior);
        media = soma / quantidade;
        System.out.println("Média: " + media);

    }
}
