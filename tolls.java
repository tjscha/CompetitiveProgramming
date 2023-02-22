import java.util.Scanner;
import java.util.*;


public class tolls {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int cities = in.nextInt();
        int roads = in.nextInt();
        int queries = in.nextInt();

        int[][] map = new int[cities+1][cities+1];

        for( int j = 1; j < cities; j++){
            for(int k = (j+1); k<= cities; k++){
                map[j][k] = 0;
                map[k][j] = 0;
            }
        }

        for(int i = 0; i<roads; i++){
            int from = in.nextInt();
            int to = in.nextInt();
            int toll = in.nextInt();
            map[from][to] = toll;
            map[to][from] = toll;
        }

        while(queries>0){

            int a = in.nextInt();
            int b = in.nextInt();

            int toll = 0;
            int currentCity;
            int minTemp = 0;
            
            boolean path = false;

            

            queries--;
        }
                
        System.out.println(x);

        in.close();
    }
}
