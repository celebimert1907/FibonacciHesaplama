package Fibonacci;

import java.util.Scanner;

public class FibonacciHesapla {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Kac elemanli islem yapmak istersiniz? ");
        int b = input.nextInt();

        int x =0;
        int total = 0;
        int top = 0;
        int i = 1;
        if (i<b) {
            for (i = 1; i < b; i++) {
                System.out.println(x=x+i);
                total=x;
                x = x + i;
                    for (int y = 1; y < b; y++) {
                        System.out.println(y=y+i);
                        top = y;
                    }
                System.out.println(x+y);
            }
        }
    }
}
