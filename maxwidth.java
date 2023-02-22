import java.util.Scanner;

public class maxwidth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int slen = in.nextInt();
        int tlen = in.nextInt();

        String s = in.next();
        String t = in.next();
        int begin = 0;
        int end = slen-1;

        char first = t.charAt(tlen-2);
        char last = t.charAt(tlen-1);

        int j = 0;

        for(int i = 0; i<tlen; i++){
            
            char find = t.charAt(i);
            
            while(find != s.charAt(j)){
                j++;
            }

        }

        while(s.charAt(end) != last && end>=0){
            end--;
        }
        begin = end-1;
        while(s.charAt(begin) != first && end>=0){
            begin--;
        }

        while(s.charAt(begin) == first){
            begin--;
        }
        begin++;
        j = end - begin;

        System.out.println(j);

        in.close();
    }
}