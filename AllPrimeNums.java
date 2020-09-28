import java.util.Scanner;
import java.util.Arrays;

public class AllPrimeNums {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        boolean t = true;
        int x = in.nextInt();

        int[] nprimos = {};

        for(int n = 2; n < x; n++) {

            t = true;

            for(int i = 2; i < n; i++) {

                if(n%i == 0) {

                    t = false;
                    break;

                }

            }

            if(t == true) {

                //System.out.println(n);
                nprimos = Arrays.copyOf(nprimos, nprimos.length + 1);
                nprimos[nprimos.length - 1] = n;

            }

        }
        
        for(int i : nprimos)
        {

            System.out.println(i);

        }

    }

}