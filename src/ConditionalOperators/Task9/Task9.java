package ConditionalOperators.Task9;

import java.util.Scanner;
// ВАЛЛ-И, катаясь на лифте, заметил, что между двумя соседними этажами он проезжает за t  секунд. Составьте программу,
//        помогающую ВАЛЛ-И рассчитать, за сколько секунд он поднимется на этаж с номером n.

//   t - время в секундах, за которое лифт поднимается на один этаж
//   n - номер этажа, на который надо подняться ВАЛЛ-И
public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n = sc.nextInt();
        --n;
        System.out.println((n * t));
    }
}
