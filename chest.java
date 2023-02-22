import java.util.Scanner;
import java.util.ArrayList;

public class chest {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        while(x>0){
            int chests = in.nextInt();
            int silver = in.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            int[] highest = new int[(silver+1)];
            highest[silver] = 0;
            int max = 0;
            int min = 1000000;

            for(int y = 0; y<3; y++){
                int a = in.nextInt();
                arr.add(a);
                if(a>max){
                    max = a;
                }
                if( a<min){
                    min = a;
                }
                
            }
            //if (chests == (silver+1)){
              //  System.out.println(max);
            //}
            int j = 0;
            int index = 0;
            while(highest[silver] == 0){
                max = arr.get(0);
                for(int k = 0; k<arr.size(); k++){

                    if(arr.get(k)>max){
                        max = arr.get(k);
                        index = k;
                    }

                }
                highest[j] = max;
                arr.remove(index);
                j++;
            }

            //find extra time
            int extra = 0;
            for(int m = 0; m<arr.size(); m++){
                extra = extra + arr.get(m);
            }
            max = 0;
            min = 1000000;
            for(int n = 0; n<highest.length; n++){
                if(highest[n]>max){
                    max = highest[n];
                }
                if(highest[n]<min){
                    min = highest[n];
                }
            }

            int difference = max - min;
            int fin = 0;
            if(extra>difference){
                extra = extra - difference;
                fin = extra + min;
            }else{
                fin = max;
            }

            System.out.println(fin);

            x--;
        }
        in.close();
    }
}
