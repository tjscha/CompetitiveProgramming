import java.util.Scanner;
import java.lang.Math;
import java.util.HashMap;

public class employees {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();

        while(x > 0){
            int num = in.nextInt();
            
            int[] high = new int[num];
            boolean found = false;
            int highest = 0;
            int sqrt = 0;
            HashMap<Integer, Integer> fnums = new HashMap<Integer,Integer>();
            for(int n = 0; n<num; n++){
                high[n] = in.nextInt();
                if(high[n] > highest){
                    highest = high[n];
                }
            }
            sqrt = (int) Math.sqrt(highest);
            sqrt = sqrt + 1;
            for( int i = 0; i<= sqrt; i++){
                fnums.put(i,0);
            }
            for (int j = 0; j< high.length; j++){
                int max = (int) Math.sqrt(high[j]);
                for (int k = 2; k<=(max+1); k++){
                    if(high[j]%k == 0){
                        if(fnums.get(k) == 1){
                            found = true;
                            k = max+1;
                            j = high.length;
                        }else{
                            fnums.put(k, (fnums.get(k)+1));
                        }

                    }
                }
            }
            
            if(found == true){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            
            x--;
        }        

        in.close();
    }
    
}
