import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nombre = "Tony Stark";
        String tipoCuenta = "Ahorros" ;
        double saldo = 2542000 ;
        int opcion = 0 ;

        System.out.println("***************************************");
        System.out.println("\nNombre del Cliente: " + nombre);
        System.out.println("El tipo de cuenta es: " + tipoCuenta);
        System.out.println("Su saldo disponible es: " + saldo);
        System.out.println("\n***************************************");

        String menu = """
                *** Escoja una Opción ***
                1 - Consultar Saldo
                2 - Retirar
                3 - Depositar
                9 - Salir
                """ ;
        Scanner teclado = new Scanner(System.in) ;
        while (opcion != 9) {
            System.out.println(menu);
            opcion = teclado.nextInt();
        }
    }
}
