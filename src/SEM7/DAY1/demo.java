package SEM7.DAY1;

import java.awt.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class demo {
    static void longestIncreasingSeq(int n,int []arr){
        int max=0,count=0;
        for(int i=1;i<n;i++){
            if(arr[i]> arr[i-1])
                count++;
            else
                count=0;
            max = Math.max(max,count);
        }

        if(max>1)
            max++;
        System.out.println(max);
    }

    public static void main(String[] args) {
        int n = 7;
        int []arr = {8,7,6,5,3,2,1};
        longestIncreasingSeq(n,arr);

    }
}
