package ConditionalOperators.Task5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a <= 12) {
            System.out.println(a / 2);
        }else {
            System.out.println(a - 10);
        }
    }
}
