import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Introduce el primer número: ");
            int num1 = sc.nextInt();

            System.out.print("Introduce el segundo número: ");
            int num2 = sc.nextInt();

            System.out.println("Resultado de la división: " + (num1 / num2));

        } catch (InputMismatchException e) {
            System.out.println("❌ Error: Debes introducir solo números.");
        } catch (ArithmeticException e) {
            System.out.println("❌ Error: No se puede dividir entre 0.");
        }

        sc.close();
    }
}