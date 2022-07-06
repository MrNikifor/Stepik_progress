package ConditionalOperators.Task10;

import java.util.Scanner;
// Робот ВАЛЛ-И любит играть в такую игру: он называет натуральное число,
//        а ЕВА берет последнюю цифру этого числа и увеличивает на n. Какое число получила ЕВА?


//    x - число, которое загадывает ВАЛЛ-И
//    n - на сколько увеличивается последняя цифра

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(x % 10 + n);
    }
}
