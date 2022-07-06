package ConditionalOperators.Task5;

import java.util.Scanner;
//ВАЛЛ-И хочет по электронным часам, показывающим часы и минуты,  узнать сколько времени в минутах прошло от начала суток.
public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(h * 60 + m);
    }
}
