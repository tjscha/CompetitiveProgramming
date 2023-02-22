import java.util.Scanner;

public class poolingpcr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double p = in.nextDouble();

        double diff = 1000000000;
        double n = 0;
        double eT = 0;
        double bP = 0;

        for(int i = 16; i>2;i--){
            bP = p/i;
            eT = (bP)+i*(1-bP);
            System.out.println(eT);
            if(i>eT){
                
                if(i-eT<diff){
                    diff = i-eT;
                    n=i;
                }
            }else{
                
                if(diff == 1000000000){
                    n=1;
                }
                  
            }
             
        }
        System.out.print(n);

        in.close();
    }
}