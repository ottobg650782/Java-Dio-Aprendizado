import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int nota;
        System.out.println("Insira a nota:");
        nota = scan.nextInt();

        while (nota < 0 || nota > 10) {
            System.out.println("Nota inválida, favor digitar novamente.");
            nota = scan.nextInt();
        }

        while (nota > 0 && nota < 10) {
            System.out.println("Nota válida.");
            break;
        }

    }
}
