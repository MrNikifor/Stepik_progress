package JavaBasics.Task4;

import java.util.Scanner;
//Дано произвольное положительное натуральное число. Найдите его последнюю цифру.
public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a % 10);
    }
}
