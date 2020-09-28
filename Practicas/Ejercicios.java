import java.util.Scanner;

public class Ejercicios
{

    public static void main(String[] args)
    {
    
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        /*while(n < 100)
        {

            System.out.println("Intentalo de nuevo");
            n = sc.nextInt();

        }

        System.out.println("Macaco");*/

        for(int i = 1; i <= n; i++)
        {

            System.out.println(i);

        }

        //System.out.println(n); 
        
        //0 < n < 10, Coche
        //n > 10, Poyo
        //hola :)

        //0
        //101
        //Macaco

        /*if(n > 10)
        {

            System.out.println("Poyo");

        }

        else if(n > 0 && n < 10)
        {

            System.out.println("Coche");

        }

        else
        {

            System.out.println("hola :)");

        }*/

    }

}