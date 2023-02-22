import java.util.Scanner;
import java.util.ArrayList;
public class cable {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        String sticks = input.next();
        int m = input.nextInt();
        int len = sticks.length();
        
        ArrayList<Character> sti = new ArrayList<Character>();
        for(int i = 0; i < sticks.length(); i++){
            sti.add(sticks.charAt(i));
        }
        //char[] sti = sticks.toCharArray();

        while(sti.size()>0){

            
            for(int i = 0; i<sti.size();i++){
                
                int count = 0;
                if(i<(sti.size()-1)){
                        
                        for(int j = i+1; j<sti.size();j++){
                            if(sti.get(i) == sti.get(j)){
                                count++;
                            }else{
                                break;
                            }
                        }
                    }
                    if((count++) >= m){
                        for(int k = i+(count--);k >= i; k--){
                            sti.remove(k);
                        }
                        i = 0;
                        if(sti.size() == 0){
                            System.out.println("Yes");
                            break;
                        }
                    }
                
            }
            if(sti.size()>0){
                System.out.println("No");
                break;
            }
        }

        System.out.println(sti.size());
        //System.out.println(m);
        input.close();
    }
}
