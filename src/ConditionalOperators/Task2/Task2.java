package ConditionalOperators.Task2;

import java.util.Scanner;

//  С клавитуры вводится 2 числа, выведете на экран большее и
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b){
            System.out.println(a);
        }else {
            System.out.println(b);
        }
    }
}
