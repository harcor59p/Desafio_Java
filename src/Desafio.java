import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nombre = "Tony Stark";
        String tipoCuenta = "Ahorros" ;
        double saldo = 1000000 ;
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

            switch (opcion) {
                case 1:
                    System.out.println("El saldo actual es " + saldo);
                    break;
                case 2:
                    System.out.println("Cual es el valor a Retirar: ");
                    double valorARetirar = teclado.nextDouble();
                    if (saldo < valorARetirar) {
                        System.out.println("Saldo insuficiente");
                    }else{
                        saldo -= valorARetirar ;
                        System.out.println("El saldo actual es " + saldo);
                    }
                    break ;
                case 3:
                    System.out.println("Cual es el valor a Deposita: ");
                    double valorADepositar = teclado.nextDouble();
                    saldo += valorADepositar ;
                    System.out.println("El saldo actual es " + saldo);
                    break;
                case 9:
                    System.out.println("Gracias por utilizar nuestros servicios");
                    break;
                default:
                    System.out.println("Opción no valida");
                    break ;

            }
        }
    }
}
