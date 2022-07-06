package ConditionalOperators.Task11;
//ВАЛЛ-И собирается съездить на уборку в соседний город и хочет рассчитать время на дорогу.
//        По карте он определил расстояние s в километрах и настроил свою скорость равной v км/ч.
//        Составьте программу, которая поможет ВАЛЛ-И определять время, проводимое в пути.

//        s - расстояние
//        v - скорость

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double s = sc.nextDouble();
        double v = sc.nextDouble();
        System.out.println(s / v);
    }
}
