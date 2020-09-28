import java.util.Scanner;

public class Condicionales
{

    public static void main(String[] args)
    {

        /*

        + sumar
        - restar
        * mult
        % modulo/residuo
        ++ 
        --

        */

        //Scanner
        Scanner sc = new Scanner(System.in);

        //sc.nextLine();
        //sc.nextInt();

        int x = sc.nextInt();
        int y = sc.nextInt();

        int suma = x + y;
        int resta = x - y;
        int mult = x * y;
        float division = (float)x / (float)y;

        if(x > y)
        {

            System.out.println("x es mayor a y");

        }

        else if(x == y)
        {

            System.out.println("x es igual a y");

        }

        else
        {

            System.out.println("x es menor y");

        }

        /*System.out.println(suma);
        System.out.println(resta);
        System.out.println(mult);
        System.out.println(division);
        System.out.println(x++);
        System.out.println(x--);
        System.out.println(y++);
        System.out.println(y--);*/

    }

}