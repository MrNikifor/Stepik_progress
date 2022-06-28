package JavaBasics.Task3;

import java.util.Scanner;
//Пирожок в столовой стоит a рублей и b копеек. Определите, сколько рублей и копеек нужно заплатить за n пирожков.
//
//        Программа получает на вход три числа: a, b, n.
//
//        Программа должна вывести два числа: стоимость покупки в рублях и копейках.
public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(a * n);
        System.out.println(b * n);
    }
}
