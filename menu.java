import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Metodos m = new Metodos();
        System.out.println("Ingrese la dimansión de la matriz");
        int n = m.ValidarEntero(sc);
        int opt = 0;
        boolean seguir = true;
        while (seguir) {
            System.out.println("Bienvenidos al taller de estructuras");
            System.out.println("Que ejercicio desea validar");
            System.out.println("Punto 1");
            System.out.println("Punto 2");
            System.out.println("Punto 3");
            System.out.println("Punto 4");
            System.out.println("Punto 5");
            System.out.println("Punto 6");
            System.out.println("Punto 7");
            System.out.println("Punto 8");
            System.out.println("Punto 9");
            System.out.println("Punto 10");
            System.out.println("Salir 11");
            opt = m.ValidarEntero(sc);
            switch (opt) {
                case 1:
                    System.out.println("punto 1");
                    break;
                case 2:
                    System.out.println("punto 2");
                    break;
                case 3:
                    System.out.println("punto 3");
                    break;
                case 4:
                    System.out.println("punto 4");
                    break;
                case 5:
                    System.out.println("punto 5");
                    break;
                case 6:
                    System.out.println("punto 6");
                    break;
                case 7:
                    System.out.println("punto 7");
                    break;
                case 8:
                    System.out.println("punto 8");
                    break;
                case 9:
                    System.out.println("punto 9");
                    break;
                case 10:
                    System.out.println("punto 10");
                    break;
                case 11:
                    seguir = false;
                    break;

                default:
                    System.out.println("por favor ingrese un opción valida \n");
                    break;
            }
        }
    }
}
