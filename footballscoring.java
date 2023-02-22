import java.util.Scanner;

public class footballscoring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        
        int T = (in.nextInt())*6;
        int F = (in.nextInt())*3;
        int S = (in.nextInt())*2;
        int eP = (in.nextInt());
        int Tw = (in.nextInt())*2;
        int T2 = (in.nextInt())*6;
        int F2 = (in.nextInt())*3;
        int S2 = (in.nextInt())*2;
        int eP2 = (in.nextInt());
        int Tw2 = (in.nextInt())*2;
        System.out.print(T+F+S+eP+Tw);
        System.out.print(" ");
        System.out.print(T2+F2+S2+eP2+Tw2);


        in.close();
    }
}