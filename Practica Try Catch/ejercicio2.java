import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldo = 1000;

        try {
            System.out.println("Saldo actual: " + saldo + " €");
            System.out.print("¿Cuánto dinero quieres ingresar o retirar? ");
            double cantidad = sc.nextDouble();

            if (cantidad < 0) {
                System.out.println("❌ Error: No puedes introducir números negativos.");
            } else if (cantidad > saldo) {
                System.out.println("❌ Error: No puedes sacar más dinero del que tienes.");
            } else {
                saldo -= cantidad;
                System.out.println("✅ Operación realizada. Nuevo saldo: " + saldo + " €");
            }

        } catch (InputMismatchException e) {
            System.out.println("❌ Error: No se puede introducir texto.");
        }

        sc.close();
    }
}