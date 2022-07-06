package ConditionalOperators.Task14;
//ВАЛЛ-И и ЕВА решили встретиться и выехали навстречу друг другу. Скорость ВАЛЛ-И составляет x км/ч, а ЕВЫ - y км/ч.
// Когда они встретились, то ВАЛЛ-И сообщил, что был в пути t часов, а ЕВА сказала, что потратила на дорогу m часов.
// Составьте программу, которая бы вычислила, какое расстояние было между ВАЛЛ-И и ЕВОЙ в момент их отправления.
//
//        x - скорость ВАЛЛ-И
//        y - скорость ЕВЫ
//        t - время ВАЛЛ-И
//        m - время ЕВЫ

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int t = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(x * t + y * m);

    }
}
