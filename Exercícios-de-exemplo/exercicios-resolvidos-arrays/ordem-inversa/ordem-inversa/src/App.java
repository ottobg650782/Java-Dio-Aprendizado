public class App {
    public static void main(String[] args) throws Exception {
        int[] vetor = { 0, -5, 15, 50, 8, 4 };

        // System.out.println(vetor.length);

        System.out.println("Vetor: ");

        int count = 0;
        while (count < (vetor.length)) {
            System.out.println(vetor[count] + " ");
            count++;
        }
        for (int i = (vetor.length - 1); i >= 0; i--) {
            System.out.println(vetor[i] + " ");
        }
    }
}
