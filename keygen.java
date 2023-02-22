import java.util.Scanner;

public class keygen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Integer number = in.nextInt();

        String num = number.toString();

        String mixed = ""+num.charAt(0)+num.charAt(2)+num.charAt(4)+num.charAt(1)+num.charAt(3);

        int fin = Integer.parseInt(mixed);

        

        System.out.println(fin);

        in.close();
    }
}
