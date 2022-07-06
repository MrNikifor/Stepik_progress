package ConditionalOperators.Task4;
// ВАЛЛ-И решил отметить день рождения и пригласил x друзей.
//   На каждого гостя ему необходимо приготовить 10 грамм заварки и по n пирожному.
//   Килограмм чая на развес стоит t рублей, а одно пирожное - k рублей.
//   Во сколько обойдется ВАЛЛ-И чаепитие? Гарантируется, что все числа в решения задачи окажутся целыми.

//  x - количество приглашенных друзей
//  t - стоимость килограмма чая
//  k - стоимость одного пирожного
//  n - количество пирожных


import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int t = sc.nextInt();
        int k = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(x * (t / 100 + k * n));
    }

}
