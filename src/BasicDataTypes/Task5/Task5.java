package BasicDataTypes.Task5;

import java.util.Scanner;
//Дано трехзначное число. Найдите сумму его цифр.
public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();                        //получаем на ввод 179
        int numFirst = num / 100;                      //находим первое число
        int numLast = num % 10;                        //находим последнее число
        int numMiddle = (num % 100) / 10;              //находим центральное число
        int solve = numFirst + numMiddle + numLast;    //складываем полученные цифры и выводим ответ
        System.out.println(solve);
    }
}
