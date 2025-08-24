package conversion_distancia;
import java.util.Scanner;

public class Test_Conversor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("🔁 Conversor de metros a kilómetros");
        System.out.print("Ingrese el valor en metros: ");
        double metros = scanner.nextDouble();

        Conversor_Distancia conversor = new Conversor_Distancia(metros, "metros", "kilómetros");
        double resultado = conversor.convertir();

        if (resultado != -1) {
            System.out.println(metros + " metros = " + resultado + " kilómetros");
        }

        scanner.close();
    }
}
