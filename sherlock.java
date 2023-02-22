import java.util.Scanner;

public class sherlock {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int jewels = in.nextInt();

        int[] arr = new int[jewels];
        for(int i = 0; i<jewels; i++){
            arr[i] = 1;

            for(int j = 0; j<jewels; j++){
                if((i+2)%(j+2) == 0){
                    arr[i] += 1;
                    break;
                }
            }
        }

        System.out.println(arr[jewels-1]);
        for(int k = 0; k<jewels;k++){
            System.out.println(arr[k]);
        }




        in.close();
    }
}
