package JavaBasics.Task5;

import java.util.Scanner;
//Дано трехзначное число. Найдите сумму его цифр.
public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 0;
        int sum = a%10;
        b = a/10%10;
        int c = a/100;
        int s = sum+b+c;
        System.out.println(s);
    }
}
