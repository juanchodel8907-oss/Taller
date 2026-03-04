import java.util.Scanner;

public class Metodos {
    public int ValidarEntero(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.println("Por favor ingrese un numero");
            sc.nextLine();
        }
        return sc.nextInt();
    }

    public Producto[][] LlenarMatriz(Producto[][] m, Scanner sc) {
        System.out.println("\nLLENANDO ESTANTERÍAS DEL SUPERMERCADO ");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                Producto p = new Producto();

                System.out.print("Ingrese el nombre del producto: ");
                p.setNombre(sc.next());

                System.out.print("Ingrese el precio: ");
                p.setPrecio(sc.nextDouble());

                System.out.print("Está disponible? (true para sí / false para no): ");
                p.setDisponibilidad(sc.nextBoolean());

                m[i][j] = p;
            }
        }
        return m;
    }

    public Producto[] FiltrarDisponibles(Producto[][] m) {

        int maxElementos = m.length * m[0].length;
        Producto[] productosFiltrados = new Producto[maxElementos];

        int k = 0;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {

                if (m[i][j].isDisponibilidad() == true) {

                    productosFiltrados[k] = m[i][j];

                    k++;
                }

            }
        }

        return productosFiltrados;
    }

    public void MostrarFiltrados(Producto[] arreglo) {
        System.out.println("\nLISTA DE PRODUCTOS DISPONIBLES ");
        for (int i = 0; i < arreglo.length; i++) {

            if (arreglo[i] != null) {
                System.out.println("Producto: " + arreglo[i].getNombre() + " | Precio: $" + arreglo[i].getPrecio());
            }
        }
    }

    public static void main(String[] args) {
        ObjetoProducto[][] almacen = new ObjetoProducto[5][6];

        almacen[0][0] = new ObjetoProducto("Arroz", 2500, 10);
        almacen[1][2] = new ObjetoProducto("Leche", 3200, 5);
        almacen[4][5] = new ObjetoProducto("Cafe", 4500, 20);

        BuscarEnAlmacen(almacen);
    }

    public static void BuscarEnAlmacen(ObjetoProducto[][] matriz) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre del producto a buscar: ");
        String buscado = sc.nextLine();
        boolean encontrado = false;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] != null && matriz[i][j].getNombre().equalsIgnoreCase(buscado)) {
                    System.out.println("Encontrado en Fila: " + i + ", Columna: " + j);
                    encontrado = true;
                    break;
                }
            }
            if (encontrado)
                break;
        }

        if (!encontrado)
            System.out.println("Producto no encontrado.");
        sc.close();
    }

    public Venta[][] LlenarMatrizP9(Venta[][] M, Scanner sc) {
        System.out.println(" REGISTRO DE VENTAS ANUALES");

        for (int i = 0; i < M.length; i++) {
            System.out.println("INGRESE NOMBRE DEL VENDEDOR: " + (i + 1) + ":");
            String nombre = sc.next();

            for (int j = 0; j < M[i].length; j++) {
                Venta v = new Venta();
                v.setNombreVendedor(nombre);

                System.out.println("Venta del mes " + (j + 1) + ": $");
                v.setValorVenta(sc.nextDouble());

                M[i][j] = v;

            }
        }
        return M;
    }

    public void BuscarMejorVendedor(Venta[][] M) {

        double maxVentasAnuales = -1;
        String mejorVendedor = "";

        System.out.println("RESULTADOS ANUALES POR VENDEDOR");

        for (int i = 0; i < M.length; i++) {
            double sumaFila = 0;
            String nombreActual = M[i][0].getNombreVendedor();

            for (int j = 0; j < M[i].length; j++) {
                sumaFila += M[i][j].getValorVenta();
            }

            System.out.println("Vendedor: " + nombreActual + " | Totalidad Anual: $" + sumaFila);

            if (sumaFila > maxVentasAnuales) {
                maxVentasAnuales = sumaFila;
                mejorVendedor = nombreActual;
            }

        }

        System.out.println("EL VENDEDOR DEL AÑO ES: " + mejorVendedor.toUpperCase());
        System.out.println("TOTAL VENDIDO : $" + maxVentasAnuales);

    }
}
