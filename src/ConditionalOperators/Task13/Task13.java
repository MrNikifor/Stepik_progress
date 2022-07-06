package ConditionalOperators.Task13;

import java.util.Scanner;
// ВАЛЛ-И случайно забрел на ферму, где увидел лошадей и гусей. Лошадей он насчитал h штук, гусей - g штук.
// Составьте программу, которая бы помогла ВАЛЛ-И узнать количество ног обитателей фермы.
//
//        h - количество лошадей
//        g - количество гусей

public class Task13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int g = sc.nextInt();
        System.out.println((n * 4) + (g * 2));
    }
}
