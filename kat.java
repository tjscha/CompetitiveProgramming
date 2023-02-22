import java.util.Scanner;
import java.util.Arrays;

public class kat{

    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);

        int animals = in.nextInt();

        long[] ani = new long[animals];
        for(int i = 0; i<animals; i++){
            ani[i] = in.nextLong();
        }

        Arrays.sort(ani);

        for(long animal : ani){
            long defend = 0;
            long attack = 0;
        }


        in.close();
    }
}