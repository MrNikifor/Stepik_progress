package ConditionalOperators.Task1;

import java.util.Scanner;

//Напишите программу, которая по введённым времени и скорости найдёт пройденный путь.
//        Сначала вводится время движения, затем скорость.
public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int t = sc.nextInt();
        System.out.println(s * t);
    }
}
