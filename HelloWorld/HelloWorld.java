import java.util.Scanner;

public class HelloWorld
{

    public static void main(String[] args)
    {

        /*
        Tipos de variables:
        Numeros enteros (int)
        Numeros decimales (float/double)
        Cadenas de caracteres (String)
        Booleano (true/false)
        null
        */

        Scanner sc = new Scanner(System.in);

        int sensorUltrasonico = 100;
        String nombre = sc.nextLine(); //""

        //Imprime "Hello World" en la consola
        System.out.println("Hello World! " + nombre);
        //System.out.println(sensorUltrasonico);
        //System.out.println(nombre);

    }

}