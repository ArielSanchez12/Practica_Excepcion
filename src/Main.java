import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int edades [] = {15, 10, 22, 40};
        int posicion;

        System.out.println("Ingrese la posicion a buscar: ");
        posicion = scanner.nextInt();

        try {
            System.out.println("La edad en la posicion " + posicion + " es: " + edades[posicion]); //Intentaras (TRY) acceder a una posicion dentro del array, segun esto, se dgenerara una excepcion en caso de que el TRY falle
                                                                                                    //En caso de que no falle, pues se va a ejecutar lo que esta aqui adentro
        }
        catch (Exception error) { //Atrapa el error que se genero arriba
            System.out.println("Intentaste ingresar a una posicion que no existe"); //Y hace lo que le pongamos aqui
            //El proposito del catch es que el programa se siga ejecutando una vez encuentre un error, ya que sin esto el programa se va a detener
        }

        System.out.println("Richard Peruano"); //Esta es una linea para probar si se sigue ejecutando el programa
    }
}