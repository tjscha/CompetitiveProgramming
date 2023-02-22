import java.util.Scanner;
import java.util.HashSet;

public class make {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        HashSet<Integer> comb = new HashSet<Integer>();
        HashSet<String> numbs = new HashSet<String>();
        
        int[] arr = new int[]{a,b,c,d};

        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr.length; j++){
                if(i == j) continue;
                for(int k = 0; k<arr.length; k++){
                    if(i == k || j == k) continue;
                    for(int l = 0; l<arr.length; l++){
                        if(i == l || j == l || k == l) continue;

                        String a1 = Integer.toString(arr[i]);
                        String b2 = Integer.toString(arr[j]);
                        String c3 = Integer.toString(arr[k]);
                        String d4 = Integer.toString(arr[l]);

                        String store = a1+b2+c3+d4;

                        numbs.add(store);
                    }
                }
            }    
        }

        for(String i : numbs){
            int w = Integer.parseInt(String.valueOf(i.charAt(0)));
            int x = Integer.parseInt(String.valueOf(i.charAt(1)));
            int y = Integer.parseInt(String.valueOf(i.charAt(2)));
            int z = Integer.parseInt(String.valueOf(i.charAt(3)));
            //System.out.println(w);
            //System.out.println(x);
            //System.out.println(y);
            //System.out.println(z);
            

        }

        System.out.println(numbs);

        input.close();
    }
}
