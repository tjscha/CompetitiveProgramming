import java.util.Scanner;
import java.util.HashSet;

public class addmod {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int tests = in.nextInt();

        while(tests>0){
            
            int numsLen = in.nextInt();
            int[] arr = new int[numsLen];
            boolean matched = false;
            boolean possible = true;
            int smallest = 200000;
            int smallInd = 0;

            HashSet<Integer> numbs = new HashSet<Integer>();
            for(int i = 0; i<numsLen; i++){
                arr[i] = in.nextInt();
                numbs.add(arr[i]);
                
                if(arr[i] == 0 && numbs.size()>1){
                    possible = false;
                    break;
                }
                if(i == 1 && arr[i]!=0 && arr[0] == 0){
                    possible = false;
                    break;
                }
            }
            
            if(numsLen == 1 && numbs.size()==1){
                matched = true;
            }
            while(!matched&&possible){

                smallest = 200000;
                numbs.clear();

                for(int i = 0; i<numsLen; i++){
                    numbs.add(arr[i]);
                    if(arr[i] == 0 && numbs.size()>1){
                        possible = false;
                        break;
                    }
                }
                if(possible == false){
                    break;
                }
                if(numbs.size()== 1){
                    matched = true;
                    break;
                }
                smallInd=-1;
                for(int i = 0; i<numsLen; i++){
                    if(arr[i]<smallest){
                        smallest = arr[i];
                        smallInd = i;
                    }

                }
                if(smallInd == -1){
                    possible = false;
                    break;
                }

                if(arr[smallInd] % 10 == 0 || arr[smallInd] > 200000){
                    possible = false;
                    break;

                }

                arr[smallInd] = arr[smallInd] + (arr[smallInd]%10);


            }
            
            if(matched == true){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
            
            tests--;
        }

        in.close();
    }
}