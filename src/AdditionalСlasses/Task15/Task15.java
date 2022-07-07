package AdditionalСlasses.Task15;

import java.util.Scanner;
//ВАЛЛ-И называет натуральное число, а ЕВА записывает 3 последовательных числа, следующих после него.
//        Напишите программу, которая выводит числа  ЕВЫ через черточку.
public class Task15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println((++a) + "-" + (++a) + "-" + (++a));
    }
}
