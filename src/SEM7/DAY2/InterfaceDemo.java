package SEM7.DAY2;

import java.io.PrintStream;
import java.util.Scanner;

interface Multiple{
    void printMultiple();
}

interface NewMultiple {
    void printNewMultiple();
}

public class InterfaceDemo implements Multiple, NewMultiple {

    static PrintStream p = new PrintStream(System.out);
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        NewMultiple nm = new InterfaceDemo();
        nm.printNewMultiple();
        Multiple m = new InterfaceDemo();
        m.printMultiple();

        p.close();
        s.close();
    }

    @Override
    public void printNewMultiple() {
        p.println("Interface: NewMultiple");

    }

    @Override
    public void printMultiple() {
        p.println("Interface: Multiple");

    }
}
