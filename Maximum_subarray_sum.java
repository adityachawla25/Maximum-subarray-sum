//Brute force algorithm
import java.util.*;
public class Maximum_subarray_sum {
    public static void print_max_sum(int numbers[]){
        int max_Sum = Integer.MIN_VALUE;
        int curr_Sum=0;
            
                for(int i = 0;i<numbers.length;i++){
                    int start = i;
                    for(int j = i ;j<numbers.length;j++){
                        int end = j;
                        curr_Sum=0;
                        for(int k =start; k<=end;k++){
                            curr_Sum+=numbers[k];
                        }  
                        if(max_Sum<curr_Sum){
                            max_Sum=curr_Sum;
                        }
                    }
                }
                System.out.println(max_Sum);
           }
    
    public static void main(String args[]){
        int numbers[]={2,4,5,7,8,9,-1,3};
        print_max_sum(numbers);
    }
}




//Prefix array sum
import java.util.*;

public class Maximum_subarray_sum {
    public static void print_max_sum(int numbers[]) {
        int curr_Sum = 0;
        int max_Sum = Integer.MIN_VALUE;

        int prefix[] = new int[numbers.length];
        prefix[0] = numbers[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = 0; j < numbers.length; j++) {
                int end = j;

                if (start == 0) {
                    curr_Sum = prefix[end];
                } else {
                    curr_Sum = prefix[end] - prefix[start - 1];
                }

                if (max_Sum < curr_Sum) {
                    max_Sum = curr_Sum;
                }
            }
        }
        System.out.print(max_Sum); 
    }

    public static void main(String args[]) {
        int numbers[] = { 2, 4, 5, 7, 8, 9, -1, 3 };
        print_max_sum(numbers);
    }
}





//Kadane's Algorithm

import java.util.*;

public class Maximum_subarray_sum {
    public static void kadane(int numbers[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i = 0; i <numbers.length;i++){
            cs = cs+ numbers[i];
            if(cs<0){
                cs=0;
            }     
            ms=Math.max(cs,ms);
        }
        System.out.println(ms);
    }
    public static void main(String args[]) {
        int numbers[] = { 2, 4, 5, 7, 8, 9, -1, 3 };
        kadane(numbers);
    }
}
