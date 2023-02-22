import java.util.Scanner;

public class medium {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int tests = in.nextInt();

        while(tests>0){
            
            int[] arr = new int[3];
            arr[0] = 0;
            arr[1] = 0;
            arr[2] = 0;

            arr[1] = in.nextInt();
            int b = in.nextInt();
            if(b<arr[1]){
                arr[0] = b;
            }else{
                arr[2] = b;
            }
            int c = in.nextInt();
            
            if(arr[0] != 0){
                if(c<b){
                    System.out.println(b);
                }else if(c>arr[1]){
                    System.out.println(arr[1]);
                }else{
                    System.out.println(c);
                }
            }else{
                if(c>b){
                    System.out.println(b);
                }else if(c < arr[1]){
                    System.out.println(arr[1]);
                }else{
                    System.out.println(c);
                }
            }
            tests--;
        }

        in.close();
    }
}