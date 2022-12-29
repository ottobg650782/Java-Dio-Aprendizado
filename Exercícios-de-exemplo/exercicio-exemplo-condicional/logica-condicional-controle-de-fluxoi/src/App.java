
public class App {
    public static void main(String[] args) throws Exception {
        microrpg("sul");

        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;

        System.out.println(b1 && b2);
        System.out.println(b1 && b3);
        System.out.println(b2 || b3);
        System.out.println(b2 || b4);
        System.out.println(b1 ^ b3);
        System.out.println(b4 ^ b1);
        System.out.println(!b1);
        System.out.println(!b2);
    }

    private static void microrpg(String direcao)

    {
        switch (direcao) {
            case "norte":
                System.out.println("Você foi para o norte, existe uma bela cadeia de montanhas por lá.");
                break;
            case "sul":
                System.out.println("Ao sul, você encontra um vasto deserto, uma imensidão de areia.");
                break;
            case "leste":
                System.out.println("Seguindo pelo leste, você chega a um porto deserto.");
                break;
            case "oeste":
                System.out.println("Indo para o oeste, você chega a uma pequena vila, onde as pessoas são felizes.");
                break;
            default:
                System.out.println("Argumento inválido. Utilize apenas norte // sul // leste // oeste");
                break;
        }
    }
}