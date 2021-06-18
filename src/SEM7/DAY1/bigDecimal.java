package SEM7.DAY1;

import java.io.PrintStream;
import java.math.BigDecimal;
import java.util.Scanner;

public class bigDecimal {

    public static void main(String[] args) {
        //write code here
        Scanner s = new Scanner(System.in);
        PrintStream p = new PrintStream(System.out);

        int n = s.nextInt();

        String[] str = new String[n + 2];

        for (int i = 0; i < n; i++) {
            str[i] = s.next();
        }

        for (int i = 0; i < n; i++) {
            BigDecimal bd1 = new BigDecimal(str[i]);
            int idx = i;
            for (int j = i + 1; j < n; j++) {

                BigDecimal bd2 = new BigDecimal(str[j]);

                if (bd2.compareTo(bd1) > 0) {
                    bd1 = bd2;
                    idx = j;
                }
            }

            String tmp = str[i];
            str[i] = str[idx];
            str[idx] = tmp;
        }

        for (int i = 0; i < n; i++) {
            p.println(str[i]);
        }

        s.close();
        p.close();
    }
}

