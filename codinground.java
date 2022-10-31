import java.util.Arrays;
import java.util.Scanner;

public class codinground {

    static int minPriceDiff(int array[], int N, int M)
    {
        int result = Integer.MAX_VALUE;
        Arrays.sort(array);
        for (int i=0; i<= N-M;i++)
            result = Math.min(result, array[i + M - 1] - array[i]);
        return result;
    }

    static int goodies(int res,int array[], int N, int M)
    {
        int result = Integer.MAX_VALUE;
        for(int i=0; i<=N; i++)
        {
            result = Math.min(result, array[i + M - 1] - array[i]);
            if (res==result)
                return i;
        }
        return 0;
    }

    public static void main(String[] args) {

        int array[]={7980,22349,999,2799,229900,11101,9999,2195,9800,4999};
        String items[]={ "Fitbit Plus: 7980","IPods: 22349","MI Band: 999","cult pass: 2799","Macbook Pro: 229900","Digital camera:11101","Alexa: 9999", "sandwich Toaster: 2195", "Microwave Oen:9800", "Scale:4999"};
        int N = array.length;
        System.out.println("Enter the number of employees");
        Scanner s = new Scanner(System.in);
        int M=s.nextInt();
        int result=minPriceDiff(array, N, M);
        System.out.println("Number of the employees:"+M);
        int startindex=goodies(result,array,N,M);
        System.out.println("Here the goodies that are selected for distribution are:");
        for(int i=startindex;i<startindex+M;i++)
            System.out.println(items[i]);
        System.out.println("\n");
        System.out.println("And the difference between the chosen goodies with highest price and the lowest price is:"+result);
    }
}
