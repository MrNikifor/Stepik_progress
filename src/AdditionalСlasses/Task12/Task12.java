package AdditionalСlasses.Task12;
// ВАЛЛ-И за 1 день выучивает n иностранных слов. Составьте программу, которая рассчитает, сколько иностранных слов выучит робот за d дней.
//
//        n - количество слов
//        d - количество дней

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        System.out.println(n * d);
    }
}
