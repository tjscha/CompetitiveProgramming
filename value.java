import java.util.Scanner;

public class value {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int min = 1000000000;
        int[] num = new int[3];
        num[0] = a;
        num[1] = b;
        num[2] = c;
        int holder = 0;
        int nextCheck = 0;
        
        if(num[0]%num[1] == 0){

            holder = num[0] / num[1];
            if(holder == 0){
                min = 0;
            }else{

                if(holder % num[2] == 0){
                    nextCheck = holder / num[2];
                    if(nextCheck<min && nextCheck >= 0){
                        min = nextCheck;
                    }
                }

                nextCheck = holder * num[2];
                if(nextCheck<min && nextCheck >= 0){
                    min = nextCheck;
                }
                nextCheck = holder + num[2];
                if(nextCheck<min && nextCheck >= 0){
                    min = nextCheck;
                }
                nextCheck = holder - num[2];
                if(nextCheck<min && nextCheck >= 0){
                    min = nextCheck;
                }
            }
        }

        if(min != 0){
            holder = num[0] + num[1];
            
            if(holder == 0){
                min = 0;
            }else{

                if(holder % num[2] == 0){
                    nextCheck = holder / num[2];
                    if(nextCheck<min && nextCheck >= 0){
                        min = nextCheck;
                    }
                }

                nextCheck = holder * num[2];
                if(nextCheck<min && nextCheck >= 0){
                    min = nextCheck;
                }
                nextCheck = holder + num[2];
                if(nextCheck<min && nextCheck >= 0){
                    min = nextCheck;
                }
                nextCheck = holder - num[2];
                if(nextCheck<min && nextCheck >= 0){
                    min = nextCheck;
                }

            }
        
        }
        
        if(min != 0){
            holder = num[0] - num[1];
            
            if(holder == 0){
                min = 0;
            }else{

                if(holder % num[2] == 0){
                    nextCheck = holder / num[2];
                    if(nextCheck<min && nextCheck >= 0){
                        min = nextCheck;
                    }
                }

                nextCheck = holder * num[2];
                if(nextCheck<min && nextCheck >= 0){
                    min = nextCheck;
                }
                nextCheck = holder + num[2];
                if(nextCheck<min && nextCheck >= 0){
                    min = nextCheck;
                }
                nextCheck = holder - num[2];
                if(nextCheck<min && nextCheck >= 0){
                    min = nextCheck;
                }

            }
        
        }
        
        if(min != 0){
            holder = num[0] * num[1];
            
            if(holder == 0){
                min = 0;
            }else{

                if(holder % num[2] == 0){
                    nextCheck = holder / num[2];
                    if(nextCheck<min && nextCheck >= 0){
                        min = nextCheck;
                    }
                }

                nextCheck = holder * num[2];
                if(nextCheck<min && nextCheck >= 0){
                    min = nextCheck;
                }
                nextCheck = holder + num[2];
                if(nextCheck<min && nextCheck >= 0){
                    min = nextCheck;
                }
                nextCheck = holder - num[2];
                if(nextCheck<min && nextCheck >= 0){
                    min = nextCheck;
                }

            }
        
        }

        System.out.println(min);
             
        in.close();
        
    }
}