
package conversionhexadecimal;

public class NumeroDecimal {


    private String numeroHex;

    public NumeroDecimal(String numeroHex) {
        this.numeroHex = numeroHex;
    }

    public void setNumeroHex(String numeroHex) {
        this.numeroHex = numeroHex;
    }

    public String getNumeroHex() {
        return numeroHex;
    }

    public int convertirADecimal() {
        int decimal = 0;
        int longitud = numeroHex.length();
        for (int i = 0; i < longitud; i++) {
            char digitoHex = numeroHex.charAt(i);
            int valorDigito = obtenerValorDigito(digitoHex);
            decimal += valorDigito * Math.pow(16, longitud - i - 1);
            
        }
        
        return decimal;
    }

    
public int obtenerValorDigito(char digitoHex) {
        if (digitoHex >= '0' && digitoHex <= '9') {
            return digitoHex - '0';
        } else if (digitoHex >= 'A' && digitoHex <= 'F') {
            return digitoHex - 'A' + 10;
        } else if (digitoHex >= 'a' && digitoHex <= 'f') {
            return digitoHex - 'a' + 10;
        } else {
            throw new IllegalArgumentException("El número ingresado no es un número hexadecimal válido");
        }
    }
}

