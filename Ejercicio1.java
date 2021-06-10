/**
 * Importamos la clase scanner del paquete java util
 */
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args){
        /**
         * Instanciamos un objeto de clase scanner para poder leer desde consola
         */
        Scanner scanner = new Scanner(System.in);

        /**
         * Inicializamos variables para poder almacenar el numero ingresado por el usuario
         * Y el resto
         */
        int numero=0, resto=0;

        /**
         * Almacenamos el numero en una variable
         */
        System.out.println("Ingrese un numero");
        numero = scanner.nextInt();

        /**
         * Vector de numeros enteros con el tamaño del numero ingresado por el usuario
         */
        int[] numeroAleatorio = new int[numero];


        /**
         * Ciclo para llenar el arreglo de numeros aleatorios 
         */
        for(int i=0; i<numeroAleatorio.length; i++){
            numeroAleatorio[i] = (int)(Math.random()*100+1);
        }

        /**
         * Ciclo que recorre el arreglo y hace evalua el resto para saber si es par o impar
         */
        for(int i=0; i<numeroAleatorio.length; i++){
            resto = numeroAleatorio[i]%2;
            if(resto==0){
                System.out.println(numeroAleatorio[i]+" es un numero par");
            }
            else if(resto!=0){
                System.out.println(numeroAleatorio[i]+" es un numero impar");
            }
        }
    }
}
