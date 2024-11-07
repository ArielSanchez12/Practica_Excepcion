import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int edades [] = {15, 10, 22, 40};
        int posicion;

        System.out.println("Ingrese la posicion a buscar: ");
        posicion = scanner.nextInt();

        try {
            System.out.println("La edad en la posicion " + posicion + " es: " + edades[posicion]);
        }
        catch (Exception error) {
            System.out.println("Intentaste ingresar a una posicion que no existe");
        }

        System.out.println("Richard Peruano");
    }
}