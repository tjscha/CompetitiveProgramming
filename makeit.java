import java.util.Scanner;

public class makeit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int tests = in.nextInt();

        while(tests>0){
            
            int numbers = in.nextInt();
            int[] arr = new int[numbers];
            int count = 0;
            for(int i = 0; i<numbers; i++){
                arr[i] = in.nextInt();
            }
            boolean found = true;
            for(int j = arr.length-2; j>=0 ; j--){
                found = true;
                while(found){
                    if(arr[j] == 0 || arr[j+1]== 0){
                        found = false;
                    }else if(arr[j] == 1 && arr[j+1] == 1){
                        arr[j] = 0;
                        count++;
                    }else if(arr[j]>=arr[j+1]){
                        arr[j] = arr[j]/2;
                        count++;
                    }else{
                        found = false;
                    }
                }
            }

            for(int k = 1; k<arr.length; k++){
                if(arr[k] == 0){
                    count = -1;
                }
                if(k>1){
                    if(arr[k] == 1){
                        count = -1;
                    }
                }
            }

            System.out.println(count);

            tests--;
        }

        in.close();
    }
}