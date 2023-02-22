import java.util.Scanner;
import java.lang.Math;

public class simplecol {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double n = in.nextInt();
        double max = Math.pow(2, n);
        int count = 0;
        double temp = 0;
        double steps = 0;
        for(double i = max; i>n; i--){
            temp = i;
            steps = n;

            while(steps>0){
                if(temp%2 == 0){
                    temp = temp/2;
                    steps--;
                }else{
                    temp++;
                    steps--;
                }
                if(temp == 1 && steps == 1){
                    count++;
                }
            }
        }
        System.out.println(count);
        in.close();
    }
}