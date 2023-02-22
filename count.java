import java.util.Scanner;
import java.util.ArrayList;

public class count {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int tests = in.nextInt();

        while(tests>0){
        
                int len = in.nextInt();
                int count = 0;
                ArrayList<Integer> nums = new ArrayList<>();
                boolean poss = true;

                for(int i = 0; i<len; i++){
                    nums.add(in.nextInt());
                }

                int z = nums.size()-1;
                for(int j = nums.size()-2; j >= 0; j--){
                    if(nums.get(j)<z){
                        poss = false;
                    }
                    z--;
                    if((nums.get(j)>= nums.get(j+1)) && poss == true){
                        nums.add(nums.get(j)/2);
                        count++;
                    }

                }
                if(poss == false){
                    System.out.println("-1");    
                }else{
                    System.out.println(count);
                }
                

            tests--;
        }

        in.close();
    }
}
