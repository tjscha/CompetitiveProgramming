import java.util.Scanner;

public class arraydec {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int tests = in.nextInt();

        while(tests>0){
        
            int n = in.nextInt();
            int[] nums1 = new int[n];
            int[] nums2 = new int[n];
            boolean possible = true;

            for(int i = 0; i<n; i++){
                nums1[i] = in.nextInt();
                //System.out.println(nums1[i]);    
            }
            for(int j = 0; j<n; j++){
                nums2[j] = in.nextInt();
                //System.out.println(nums2[j]);
            }


            int equalGap = 0;

            for(int k = 0; k<nums1.length; k++){
                if(nums2[k]!=0 && nums1[k]!=0){
                    equalGap = nums1[k]-nums2[k];
                    if(nums1[k]!= 0){
                        if(nums2[k]>nums1[k]){
                            possible = false;
                        }
                    } 
                    break;  
                }
            }

            for(int m = 0; m<nums1.length; m++){
                if(nums2[m] == 0){
                    if(nums1[m]>equalGap){
                        possible = false;
                        break;
                    }
                }
                if(nums1[m] == 0){
                    if(nums2[m] != 0){
                        possible = false;
                        break;
                    }
                }
                if(nums1[m] != 0 && nums2[m] != 0){
                    if(nums1[m]-nums2[m] != equalGap){
                        possible = false;
                        break;
                    }
                }
                
            }
            
            if(nums1.length == 1){
                if(nums1[0]<nums2[0]){
                    possible = false;
                }else{
                    possible = true;
                }
                
            }

            boolean allZeros = true;
            for(int p = 0; p<nums1.length; p++){
                if(nums2[p] != 0){
                    allZeros = false;
                }
            }
            if(allZeros){
                possible = true;
            }

            if(possible){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
            

            tests--;
        }

        in.close();
    }
}