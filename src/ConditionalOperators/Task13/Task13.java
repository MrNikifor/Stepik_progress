package ConditionalOperators.Task13;

import java.util.Scanner;

//Вводится целое число n (0 < n < 1000). Определите, является ли оно двузначным? Выведите в ответ "Yes"/"No".
public class Task13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        if(n > 9 && n < 100){
            System.out.println("Yes");
        }else if (n < 10 || n > 99){
            System.out.println("No");
        }
    }
}
