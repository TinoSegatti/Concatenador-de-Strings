package main;
import java.util.*;

public class Solution {
    
    public static void main(String[] args){ 
       
        Scanner scanner = new Scanner(System.in);

        
        
        String cadena1 = scanner.nextLine();
        
         String primeraLetraMayuscula1 = cadena1.substring(0, 1).toUpperCase();
         String restoCadena1 = cadena1.substring(1);
         String cadenaFormateada1 = primeraLetraMayuscula1 + restoCadena1;

        String cadena2 = scanner.nextLine();
        
        //funcion substring(a,b) escribe a - b
        
        String primeraLetraMayuscula2 = cadena2.substring(0, 1).toUpperCase();
        String restoCadena2 = cadena2.substring(1);
        String cadenaFormateada2 = primeraLetraMayuscula2 + restoCadena2;

        String resultado = cadenaFormateada1 + " " + cadenaFormateada2;
        
        int contadorCaracteresNoVacios = 0;
        for (int i = 0; i < resultado.length(); i++) {
            char caracter = resultado.charAt(i);
            if (!Character.isWhitespace(caracter)) {
                contadorCaracteresNoVacios++;
            }
        }
        System.out.println (contadorCaracteresNoVacios);
        
        int lexico = cadenaFormateada1.compareTo(cadenaFormateada2);
        
        if(lexico < 0) {
            System.out.println("No");
        }else if (lexico > 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
        System.out.println (resultado);
        
        scanner.close();
    }
}
    

