import java.util.Scanner;
import java.lang.Math;

public class infinity {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int tests = in.nextInt();

        while(tests>0){
        
            int find = in.nextInt();

            double mark = (Math.sqrt(find));
            int group = 1;
            int x = 0;
            int y = 0;

            if(mark%1 == 0){
                group = ((int)Math.sqrt(find));
                x = group;
                y = 1;
            }

            group = ((int)Math.sqrt(find))+1;

            int groupEnd = group*group;
            int groupBeg = ((group-1)*(group-1))+1;
            int verticalPoint = ((groupEnd-groupBeg)/2)+groupBeg-1;
            
            if(find<5){
                if(find == 1){
                    x = 1;
                    y = 1;
                }else if(find == 2){
                    x = 1;
                    y = 2;
                }else if(find == 3){
                    x = 2;
                    y = 2;
                }else if(find == 4){
                    x = 2;
                    y = 1;
                }
            }else if(x == 0){
                
                if(verticalPoint >= find){

                    x = (find - groupBeg)+1;
                    y = ((int)Math.sqrt(groupEnd));
                }else{
                    x = ((int)Math.sqrt(groupEnd));
                    y = (groupEnd - find)+1;
                }
                
            }

            System.out.println(x+" "+y);

            tests--;
        }

        in.close();
    }
}