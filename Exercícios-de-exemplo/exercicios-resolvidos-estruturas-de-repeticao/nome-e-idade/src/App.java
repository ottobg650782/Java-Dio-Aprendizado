import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;
        String resposta;

        while (true) {
            System.out.println("Insira o nome:");
            nome = scan.next();
            System.out.println("Insira a idade:");
            idade = scan.nextInt();
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
            System.out.println("Deseja repetir? sim/nao ");
            resposta = scan.next();
            if (resposta.equals(("sim")))
                continue;
            if (resposta.equals(("nao")))
                break;

        }
        System.out.println("Continua aqui...");
    }

}
