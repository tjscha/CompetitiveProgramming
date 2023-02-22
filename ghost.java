import java.util.Scanner;

public class ghost {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int elements = in.nextInt();
        int rungs = in.nextInt();
        int[] swaps = new int[rungs];
        int[] numbers = new int[elements];
        for(int i = 0; i<elements; i++){
            numbers[i] = (i+1);
        }
        
        for(int j = 0; j<rungs; j++){
            swaps[j] = in.nextInt();
        }

        for(int k = 0; k<rungs; k++){
            int x = numbers[swaps[k]];
            numbers[swaps[k]] = numbers[(swaps[k]-1)];
            numbers[swaps[k]-1] = x;
        }
        for(int j = 0; j<elements; j++){
            System.out.println(numbers[j]);
        }       
        in.close();
        
    }
}