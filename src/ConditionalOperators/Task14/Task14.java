package ConditionalOperators.Task14;

import java.util.Scanner;

//Вводится целое число n (0 < n < 1000). Определите, сколько в нём цифр. Выведите ответ на экран.
public class Task14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n < 10){
            System.out.println("1");
        }else if (n > 9 && n < 100){
            System.out.println("2");
        }else if(n > 99 && n < 1000){
            System.out.println("3");
        }else {
            System.out.println("4");
        }
    }
}
