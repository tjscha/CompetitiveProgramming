import java.util.Scanner;

public class encode {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
    
            int tests = in.nextInt();
    
            while(tests>0){
            
                int len = in.nextInt();
                String code = in.next();
                String[] letters = new String[len];
                int letMark = 0;

                for(int i = (len-1); i>=0; i--){
                    if(code.charAt(i) == '0'){
                        letters[letMark] = code.substring((i-2), i);
                        letMark++;
                        i-=2;
                    }else{
                        letters[letMark] = code.substring(i, (i+1));
                        letMark++;
                    }
                }

                String fin = "";

                for(int j = (letMark-1); j>=0; j--){

                    if(letters[j].equals("1")){
                        fin = fin+"a";
                    }else if(letters[j].equals("2")){
                        fin = fin + "b";
                    }else if(letters[j].equals("3")){
                        fin = fin + "c";
                    }else if(letters[j].equals("4")){
                        fin = fin + "d";
                    }else if(letters[j].equals("5")){
                        fin = fin + "e";
                    }else if(letters[j].equals("6")){
                        fin = fin + "f";
                    }else if(letters[j].equals("7")){
                        fin = fin + "g";
                    }else if(letters[j].equals("8")){
                        fin = fin + "h";
                    }else if(letters[j].equals("9")){
                        fin = fin + "i";
                    }else if(letters[j].equals("10")){
                        fin = fin + "j";
                    }else if(letters[j].equals("11")){
                        fin = fin + "k";
                    }else if(letters[j].equals("12")){
                        fin = fin + "l";
                    }else if(letters[j].equals("13")){
                        fin = fin + "m";
                    }else if(letters[j].equals("14")){
                        fin = fin + "n";
                    }else if(letters[j].equals("15")){
                        fin = fin + "o";
                    }else if(letters[j].equals("16")){
                        fin = fin + "p";
                    }else if(letters[j].equals("17")){
                        fin = fin + "q";
                    }else if(letters[j].equals("18")){
                        fin = fin + "r";
                    }else if(letters[j].equals("19")){
                        fin = fin + "s";
                    }else if(letters[j].equals("20")){
                        fin = fin + "t";
                    }else if(letters[j].equals("21")){
                        fin = fin + "u";
                    }else if(letters[j].equals("22")){
                        fin = fin + "v";
                    }else if(letters[j].equals("23")){
                        fin = fin + "w";
                    }else if(letters[j].equals("24")){
                        fin = fin + "x";
                    }else if(letters[j].equals("25")){
                        fin = fin + "y";
                    }else if(letters[j].equals("26")){
                        fin = fin + "z";
                    }
                }

                System.out.println(fin);

    
                tests--;
            }
    
            in.close();        
    }
}
