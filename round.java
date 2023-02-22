import java.util.Scanner;
import java.lang.Math;

public class round {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int tests = in.nextInt();

        while(tests>0){
        
            int price = in.nextInt();
            
            String digits = Integer.toString(price);
            //System.out.println(digits);

            int len = digits.length();
            //System.out.println(len);

            if(len>1){
                //int maxdigit = Character.getNumericValue(digits.charAt(0));
                //System.out.println(maxdigit);

                len--;
                double whole = Math.pow(10, len);
                //System.out.println(whole);

                //whole = whole*maxdigit;
                //System.out.println(whole);

                whole = price - whole;

                
                    
                System.out.println((int)whole);
            }else{
                System.out.println(price-len);
            }
            tests--;
        }

        in.close();
    }
}