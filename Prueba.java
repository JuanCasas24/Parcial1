import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el título del libro:");
        String titulo = scanner.nextLine();

        System.out.println("Ingrese el autor del libro:");
        String autor = scanner.nextLine();

        System.out.println("Ingrese el precio del libro:");
        double precio = scanner.nextDouble();
        scanner.nextLine(); // Consumir la nueva línea pendiente

        System.out.println("Seleccione el tipo de libro:");
        System.out.println("1. Libro");
        System.out.println("2. Libro de Texto");
        System.out.println("3. Libro de Texto UNIAJC");
        System.out.println("4. Novela");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea pendiente

        switch (opcion) {
            case 1:
                Libro libro = new Libro(titulo, autor, precio);
                libro.imprimir();
                break;
            case 2:
                System.out.println("Ingrese el curso del libro de texto:");
                String curso = scanner.nextLine();
                libroTexto libroTexto = new libroTexto(titulo, autor, precio, curso);
                libroTexto.imprimir();
                break;
            case 3:
                System.out.println("Ingrese el curso del libro de texto:");
                curso = scanner.nextLine();
                System.out.println("Ingrese la facultad del libro de texto UNIAJC:");
                String facultad = scanner.nextLine();
                LibroTextoUNIAJC libroIUAJC = new LibroTextoUNIAJC(titulo, autor, precio, curso, facultad);
                libroIUAJC.imprimir();
                break;
            case 4:
                System.out.println("Ingrese el tipo de novela:");
                String tipo = scanner.nextLine();
                Novela novela = new Novela(titulo, autor, precio, tipo);
                novela.imprimir();
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }

        scanner.close();
    }
}
