package ConditionalOperators.Task6;

import java.util.Scanner;

//У Пети очень странные часы. Они считают время не так, как остальные - они отсчитывают количество секунд от начала суток.
//
//        Как-то раз Петя уснул, будильник, не сработал, но взглянув на часы, Петя не смог понять, успел ли он на уроки, или опоздал. Если Петя проснулся ровно в ту секунду, когда должен был, или раньше, то он успевает на учёбу.
//
//        На вход даётся 3 целых числа: h, m - время, в которое Пете надо было проснуться, и x - время, которое показывают его часы.
public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        if((h * 60 + m ) * 60 >= s) {
            System.out.println("Успел");
        }else {
            System.out.println("Опоздал");
        }
    }
}
