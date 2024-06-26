package numeros;
import java.util.Scanner;

public class ejercicios {
    public static void main(String[] args) {
    int arrayDatos [] = {31,22,63,54,15,86,37,18,99};
    int maximo = arrayDatos [0];
    
    for (int i = 0; i < arrayDatos.length; i++) {
        if (arrayDatos[i] > maximo) {
            maximo = arrayDatos[i];
            System.out.println("El maximo es: " + maximo);
        }
         
        }
        for (int j = 0; j < arrayDatos.length; j++) {
            System.out.println("Los datos son: " + arrayDatos[j]);    
        }
       
    }
    //System.out.println("Elemento en el índice " + i + ": " + numeros[i]);, el propósito de numeros[i] es acceder al elemento del array numeros en la posición i
    // [i] es igual al indice porque recuerda que empieza desde 0,1,2,3,4,5,6,7,8 pero estos no son los numeros de el array, solo el indice
    }


/* 
//IMPAR O PAR
import java.util.Scanner;

public class ejercicios {
    public static void main(String[] args) {

    Scanner scanner =new Scanner(System.in); 
    System.out.println("Ingrese un numero: ");
    int numero = scanner.nextInt();

    if (numero % 2 == 0 ) {
        System.out.println("El numero we: " + numero + " es par valedor.");
    }else{
        System.out.println("nel perro el numero: "+numero+ " es impar.");
    }
    
    }
}
    */

    /* 
    CREAR ARRAYS E IMPRIMIRLOS Y BUSCAR EL MAS GRANDE

public class ejercicios {
    public static void main(String[] args) {
    int arrayDatos [] = {31,22,63,54,15,86,37,18,99};
    int maximo = arrayDatos [0];
    
    for (int i = 0; i < arrayDatos.length; i++) {
        if (arrayDatos[i] > maximo) {
            maximo = arrayDatos[i];
            System.out.println("El maximo es: " + maximo);
        }
         
        }
        for (int j = 0; j < arrayDatos.length; j++) {
            System.out.println("Los datos son: " + arrayDatos[j]);    
        }
       
    }
    //System.out.println("Elemento en el índice " + i + ": " + numeros[i]);, el propósito de numeros[i] es acceder al elemento del array numeros en la posición i
    // [i] es igual al indice porque recuerda que empieza desde 0,1,2,3,4,5,6,7,8 pero estos no son los numeros de el array, solo el indice
    }
     */
