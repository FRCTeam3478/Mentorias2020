public class Ciclos
{

    public static void main(String[] args)
    {

        int x = 10;

        //Arreglo
        int[] arr = {254, 148, 118, 3478, 3847};

        /*

         0  1  2  3  4
        [1][2][3][4][5]
        
        */

        /*while(x > 0)
        {

           //Codigo a ejecutar dentro del ciclo
           x--;
           System.out.println(x);

        }*/

        /*do
        {

            x--;
            System.out.println(x);

        }while(x > 11);*/

        //System.out.println(arr[0] + x);

        for(int i = 0; i < arr.length; i++)
        {

            System.out.println(arr[i]);

        }

        /*int sumatoria = 0;

        for(int i : arr)
        {

            //Hacer sumatoria
            sumatoria += i;

        }

        System.out.println(sumatoria);*/

    }

}