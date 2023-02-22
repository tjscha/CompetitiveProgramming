import java.math.BigInteger;
import java.util.Scanner;

public class cherry {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int tests = in.nextInt();

        while(tests>0){
        
                int list = in.nextInt();

                BigInteger test;
                BigInteger sum = new BigInteger("1");


                BigInteger[] arr = new BigInteger[list];

                for(int x = 0; x<list; x++){
                    BigInteger num = in.nextBigInteger();
                    arr[x] = num;
                    if(x>0){
                        test = arr[x].multiply(arr[x-1]);
                        if(test.compareTo(sum) == 1){
                            sum = test;
                        }
                    } 

                }




                System.out.println((sum));


            tests--;
        }

        in.close();
    }
}