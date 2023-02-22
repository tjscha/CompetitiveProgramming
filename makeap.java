import java.util.Scanner;

public class makeap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int tests = in.nextInt();

        while(tests>0){
        
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            
            boolean possible = true;
            boolean found = false;

            if(a == b && b == c){
                found = true;
            }
            
            int diff = a - c;

            if(diff == -1 || diff == 1){
                if(a>c){
                    if(c >= b){
                        possible = false;
                    }
                }else if(c>a){
                    if(a >= b){
                        possible = false;
                    }
                }
            }

            if(diff<0){
                diff = diff * -1;
            }


            if(possible && !found){
                if(b > a && b > c){
                    diff = b-a;
                    if((b+diff)%c == 0){
                        found = true; 
                    }
                    diff = b-c;
                    if((b+diff)%a == 0){
                        found = true; 
                    }
                }else if(a>c && c>b){
                    diff = a - ((a - c)/2);
                    if(diff % b == 0){
                        found = true;
                    }
                }else if(c>a && a>b){
                    diff = c - ((c - a)/2);
                    if(diff % b == 0){
                        found = true;
                    }
                }else if(a == c){
                    if(a % b == 0){
                        found = true;
                    }
                }else if(c >= b && b >= a){
                    diff = b - (c - b);
                    if(diff % a == 0 && diff !=0){
                        found = true;
                    }
                    diff = c - ((c - a)/2);
                    if(diff % b == 0){
                        found = true;
                    }
                    diff = b + (b - a);
                    if(diff % c == 0){
                        found = true;
                    }
                }else if(a >= b && b >= c){
                    diff = b - (a - b);
                    if(diff % c == 0 && diff!=0){
                        found = true;
                    }
                    diff = a - ((a - c)/2);
                    if(diff % b == 0){
                        found = true;
                    }
                    diff = b + (b - c);
                    if(diff % a == 0){
                        found = true;
                    }
                }
            }   
            
            if(found){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }

            tests--;
        }

        in.close();
    }
}
