package AdditionalСlasses.Task7;
//ВАЛЛ-И очень любит читать. В его книге n страниц и каждый день он читает по s страниц.
//        Составьте программу, которая считает, сколько страниц останется ВАЛЛ-И прочитать через d дней.

// n - количество страниц в книге
// s  - количество страниц, которые прочитывает ВАЛЛ-И каждый день
// d - количество дней

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int d = sc.nextInt();
        System.out.println(n - (s * d));
    }
}
