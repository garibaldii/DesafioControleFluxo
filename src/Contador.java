import java.util.Scanner;
import pacoteComplementar.ParametrosInvalidosException;

public class Contador {

    static Scanner input = new Scanner(System.in);
    static int A = input.nextInt();
    static int B = input.nextInt();

    public static int subtrairFor(int A, int B) {
        return A - B;
    }

    public static void main(String[] args) throws ParametrosInvalidosException {

        if (A < B) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior ou igual ao primeiro");
        }
        //Em Java, throw é uma palavra-chave usada para lançar uma exceção. Quando você usa throw seguido por uma instância de uma classe de exceção, você está sinalizando que ocorreu uma condição excepcional no seu código e que você deseja notificar esse evento ao sistema de tratamento de exceções.

        for (int i = 0; i < subtrairFor(A, B); i++) {
            System.out.println("Imprimindo o número " + (i + 1));
        }
    }
}
