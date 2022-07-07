package ConditionalOperators.Task4;

import java.util.Scanner;

// Напишите программу, которая считывает 2 действительных числа и выводит их частное. Если это невозможно, то выводит слово "Error"
public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         double a = sc.nextDouble();
         double b = sc.nextDouble();
         if(b != 0){
             System.out.println(a / b);
         }else {
             System.out.println("Error");
         }
    }
}
