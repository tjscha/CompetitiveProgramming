import java.util.Scanner;

public class ebony {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int leftover = c%b;
        if(leftover == 0){
            System.out.println("Yes");
        }else if(leftover%a == 0){
            System.out.println("Yes");
        }else{
            int divided = c/b;
            int checkLeft = 0;
            
            while(divided>=0){
                checkLeft = b*divided;
                checkLeft = c-checkLeft;
                if(checkLeft%a == 0){
                    System.out.println("Yes");
                    break;
                }
                divided--;
            }
            if(divided < 0){
                System.out.println("No");
            }
        }

        

        in.close();
    }
}
