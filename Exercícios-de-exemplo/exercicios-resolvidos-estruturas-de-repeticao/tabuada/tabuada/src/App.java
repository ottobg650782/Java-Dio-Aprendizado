import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira um número:");

        int tabuada = scan.nextInt();
        System.out.println("Tabuada de: " + tabuada);

        for (int i = 1; i <= 10; i++) {
            System.out.println(tabuada + " x " + i + " = " + (tabuada * i));
        }

    }
}
