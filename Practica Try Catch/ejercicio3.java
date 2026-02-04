import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] estantes = {10, 5, 8, 0};

        try {
            System.out.print("¿De qué estante quieres sacar cajas? ");
            int posicion = sc.nextInt();

            System.out.print("¿Cuántas cajas quieres sacar? ");
            int cajas = sc.nextInt();

            if (cajas < 0) {
                System.out.println("❌ Error: No puedes sacar cajas negativas.");
            } else if (estantes[posicion] < cajas) {
                System.out.println("❌ Error: No hay suficientes cajas en el estante.");
            } else {
                estantes[posicion] -= cajas;
                System.out.println("✅ Operación realizada. Cajas restantes: " + estantes[posicion]);
            }

        } catch (InputMismatchException e) {
            System.out.println("❌ Error: No se puede introducir texto.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("❌ Error: El estante no existe.");
        }

        sc.close();
    }
}