import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int quantnumeros = 0;
        int numero = 0;
        int quantpares = 0;
        int quantimpares = 0;

        System.out.println("insira a q9uantidade de números :");
        quantnumeros = scan.nextInt();

        int count = 0;
        do {
            System.out.println("Número :");
            numero = scan.nextInt();

            if (numero % 2 == 0)
                quantpares++;
            else
                quantimpares++;

            count++;
        } while (count < quantnumeros);

        System.out.println("Quantidade de números pares: " + quantpares);
        System.out.println("Quantidade de números ímpares: " + quantimpares);
    }
}
