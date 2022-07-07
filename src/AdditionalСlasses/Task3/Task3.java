package AdditionalСlasses.Task3;

import java.util.Scanner;
//        Робот ВАЛЛ-И решил отправиться в соседний город.
//        Половину пути он проехал за t часов со скоростью x км/ч ,
//        а остальное расстояние со скоростью y км/ч. Рассчитайте, сколько времени ВАЛЛ-И был в пути.
public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println((t * x / y) + 2);
    }
}
