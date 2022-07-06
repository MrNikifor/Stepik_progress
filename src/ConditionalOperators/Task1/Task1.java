package ConditionalOperators.Task1;

import java.util.Scanner;
//Путешествуя, ВАЛЛ-И попал в логово к Дракону. Чтобы остаться в живых ему надо угадать число, которое задумали его головы.
//        Первая голова называет любое целое число, вторая - увеличивает его на 3, а третья результат уменьшает в 2 раза.
//        Составьте программу, которая позволит ВАЛЛ-И безошибочно вычислять результат.
public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = (a + 3) / 2;
        System.out.println(b);
    }
}
