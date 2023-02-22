import java.util.Scanner;

public class metronome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double length = in.nextDouble();
        double count = length/4;

        System.out.println(count);
             
        in.close();
        
    }
}