package AdditionalСlasses.Task6;

import java.util.Scanner;

//ВАЛЛ-И очень любит читать. В его книге n страниц и каждый день он читает по s страниц.
//        Составьте программу, которая считает, сколько страниц останется ВАЛЛ-И прочитать через 5 дней.
public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        System.out.println(n - (s * 5));
    }
}
