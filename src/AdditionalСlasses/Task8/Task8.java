package AdditionalСlasses.Task8;
//ВАЛЛ-И встретил n детей и хочет разделить между ними k яблок так, чтобы каждому досталось поровну.
//        Не делящийся остаток он собирается отнести ЕВЕ. Сколько яблок достанется каждому ребенку? Сколько яблок получит ЕВА?


//  n - количество детей
//  k - количество яблок

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(k / n + " " + k % n);
    }
}
