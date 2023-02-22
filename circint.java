import java.util.Scanner;

public class circint {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int tests = in.nextInt();

        while(tests>0){
            
            int x1 = in.nextInt();
            int y1 = in.nextInt();
            int x2= in.nextInt();
            int y2 = in.nextInt();
            int r1 = in.nextInt();
            int r2 = in.nextInt();

            if(x1<= x2){
                x2 = x2 + r2;
                
            }
                
            System.out.println(x);

            tests--;
        }

        in.close();
    }
}
