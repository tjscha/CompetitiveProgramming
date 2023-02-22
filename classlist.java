import java.util.Scanner;
import java.util.*;

public class classlist {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String first = in.next();
        String second = in.next();
        String fin = first+second;
        int len = fin.length();
        char[] list = new char[len];
        for(int i = 0; i<list.length; i++){
            list[i] = fin.charAt(i);
        }

        Arrays.sort(list);
        String finallist = new String(list);

        System.out.println(finallist);
             
        in.close();
        
    }
}