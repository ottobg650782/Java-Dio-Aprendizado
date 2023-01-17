import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Random random = new Random();

        int[] numerosaleatorios = new int[20];

        for (int i = 0; i < numerosaleatorios.length; i++) {
            int numero = random.nextInt(100);
            numerosaleatorios[i] = numero;
        }

        System.out.print("Números aleatórios: ");
        for (int numero : numerosaleatorios) {
            System.out.print(numero + " ");
        }

        System.out.print("\nAntecessor dos números aleatórios: ");
        for (int numero : numerosaleatorios) {
            System.out.print((numero - 1) + " ");
        }

        System.out.print("\nSucessores dos números aleatórios: ");
        for (int numero : numerosaleatorios) {
            System.out.print((numero + 1) + " ");

        }

    }

}
