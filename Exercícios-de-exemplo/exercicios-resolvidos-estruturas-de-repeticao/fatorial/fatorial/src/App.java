import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira um número:");
        int fatorial = scan.nextInt();
        int mult = 1;
        System.out.println(fatorial + "! = ");
        for (int i = fatorial; i >= 1; i--) {
            mult = mult * i;
        }
        System.out.println(mult);
    }
}
