package SEM7.DAY2;

import java.util.Arrays;
import java.util.Scanner;

interface AdvancedArithmetic{
    int divisor(int n);
}

public class Solution implements AdvancedArithmetic{
    @Override
    public int divisor(int n) {
        int multiples=0;
        for (int i=1;i<=n;i++){
            if(n%i==0)
                multiples+=i;
        }

        return multiples;
    }

    public static void main(String[] args) {

        int n = (new Scanner(System.in)).nextInt();
        AdvancedArithmetic aa = new Solution();

        System.out.println("I implemented: "+ aa.getClass().getInterfaces()[0].getSimpleName());
        System.out.println(aa.divisor(n));

    }
}
