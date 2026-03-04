import java.util.Scanner;

public class Metodos {
    public int ValidarEntero(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.println("Por favor ingrese un numero");
            sc.nextLine();
        }
        return sc.nextInt();
    }
}
