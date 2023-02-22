import java.util.Scanner;
import java.util.HashMap;

public class chandies {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        //test cases
        int x = in.nextInt();

        while(x>0){
            
            //bags of candy
            int count = in.nextInt();

            //divisor hashmap
            HashMap<Integer, Integer> divs = new HashMap<>();
            divs.put(count,1);
            boolean found = false;

            for(int i = count-1; i>=2; i--){
                found = false;
                for(int j = count; j>i ; j--){
                        if(j%i == 0){
                            if(divs.get(j)<2){
                                divs.put(j,divs.get(j)+1);
                                found = true;
                            }
                        }
                    if(found == true){
                        break;
                    }
                }
                if(found == false){
                    divs.put(i,1);
                }
            }
            if(count == 1){
                System.out.println("1");    
            }else if(count ==2){
                System.out.println("2");
            }else if(count == 3){
                System.out.println("3");
            }else{
                System.out.println(divs.size()+1);
            }    
            x--;
        }
        
    
        in.close();
    }
}
