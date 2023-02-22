import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.lang.Math;

public class easysched {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int tests = in.nextInt();

        while(tests>0){
        
            double height = in.nextInt();
            int procs = in.nextInt();
            Queue<Double> que = new LinkedList<>();
            Double bubble = (Math.pow(2,(height-1))*2)-1;
            //System.out.println(bubble);
            int timeCount = 0;
            que.add(bubble);

            while(que.size()>0){
                
                for(int i = 0; i<procs; i++){
                    
                    if(bubble>0){
                        que.remove();
                        bubble--;
                    }

                    if(que.size()==0){
                        
                        if(bubble>1){
                            que.add(bubble);
                            que.add(bubble);
                        }else if(bubble>0){
                            que.add(bubble);
                        }
                        break;
                    }else{

                        if(bubble>1){
                            que.add(bubble);
                            que.add(bubble);
                        }else if(bubble>0){
                            que.add(bubble);
                        }
                    }

                    if(bubble == 0){
                        que.clear();
                        break;
                    }
                    
                }
                timeCount++;
            }
            if(procs<height){
                timeCount++;
            }
            System.out.println(timeCount);

            tests--;
        }

        in.close();
    }
}
