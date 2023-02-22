import java.util.Scanner;

public class morse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String input = in.next();
        input = input.toLowerCase();
        
        String morse = "";
        int len = input.length();
        for(int i = 0; i<len; i++){
            switch(input.charAt(i)){
                case 'a':
                    morse = morse + ".-";
                    break;
                case 'b':
                    morse = morse + "-...";
                    break;
                case 'c':
                    morse = morse + "-.-.";
                    break;
                case 'd':
                    morse = morse + "-..";
                    break;
                case 'e':
                    morse = morse + ".";
                    break;
                case 'f':
                    morse = morse + "..-.";
                    break;
                case 'g':
                    morse = morse + "--.";
                    break;
                case 'h':
                    morse = morse + "....";
                    break;
                case 'i':
                    morse = morse + "..";
                    break;
                case 'j':
                    morse = morse + ".---";
                    break;
                case 'k':
                    morse = morse + "-.-";
                    break;
                case 'l':
                    morse = morse + ".-..";
                    break;
                case 'm':
                    morse = morse + "--";
                    break;
                case 'n':
                    morse = morse + "-.";
                    break;
                case 'o':
                    morse = morse + "---";
                    break;
                case 'p':
                    morse = morse + ".--.";
                    break;
                case 'q':
                    morse = morse + "--.-";
                    break;
                case 'r':
                    morse = morse + ".-.";
                    break;
                case 's':
                    morse = morse + "...";
                    break;
                case 't':
                    morse = morse + "-";
                    break;
                case 'u':
                    morse = morse + "..-";
                    break;
                case 'v':
                    morse = morse + "...-";
                    break;
                case 'w':
                    morse = morse + ".--";
                    break;
                case 'x':
                    morse = morse + "-..-";
                    break;
                case 'y':
                    morse = morse + "-.--";
                    break;
                case 'z':
                    morse = morse + "--..";
                    break;
                case '0':
                    morse = morse + "-----";
                    break;
                case '1':
                    morse = morse + ".----";
                    break;
                case '2':
                    morse = morse + "..---";
                    break;
                case '3':
                    morse = morse + "...--";
                    break;
                case '4':
                    morse = morse + "....-";
                    break;
                case '5':
                    morse = morse + ".....";
                    break;
                case '6':
                    morse = morse + "-....";
                    break;
                case '7':
                    morse = morse + "--...";
                    break;
                case '8':
                    morse = morse + "---..";
                    break;
                case '9':
                    morse = morse + "----.";
                    break;
                
            }
        }
        int len2 = morse.length();

        String esrom = "";
        
        for(int i = len2-(len2/2); i<len2; i++){
            esrom = morse.charAt(i) + esrom;
        }
        if(len2 == 0){
            System.out.println("NO");
        }else{
            if(morse.substring(0, (len2/2)).equals(esrom)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
        
        System.out.println(morse.substring(0, (len2/2)));
        System.out.println(esrom);

        in.close();
    }
}