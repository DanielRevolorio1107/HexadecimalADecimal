
package conversionhexadecimal;

import java.util.Scanner;

public class Conversor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------Bienvenido------------");
        System.out.println("Conversor de numeros base Hexadecimal a base Decimal");
        System.out.print("Ingrese un numero en base hexadecimal: ");
        String numeroHex = scanner.nextLine();

        NumeroDecimal numeroDecimal = new NumeroDecimal(numeroHex);
        

        System.out.println("El número en base decimal es: " + numeroDecimal.convertirADecimal());
    }
}
