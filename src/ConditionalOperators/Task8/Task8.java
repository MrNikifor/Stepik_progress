package ConditionalOperators.Task8;

import java.util.Scanner;
// По данному году определите, является ли он високосным. Если забыли, какой год называют високосным,
//        Если год Високосный, то выведите "Yes", если же нет, то выведете "No"
public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
