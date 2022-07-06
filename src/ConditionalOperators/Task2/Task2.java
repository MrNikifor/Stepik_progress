package ConditionalOperators.Task2;

import java.util.Scanner;
//Робот ВАЛЛ-И каждый день меняет пароль от своей учетной записи на обучающей платформе.
//        Ему нравится придумывать числа разной длины и суммировать их последние цифры.
//        К получившемуся значению он добавляет строчные согласные буквы,
//        входящие в его имя на латинице. Составьте программу для ВАЛЛ-И,
//        которая позволяла бы ему придумывать 3 любых целых числа и выдавала бы пароль на текущий день.
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int n = a % 10 + b % 10 + c % 10;
        System.out.print(n + "vll");
    }
}
