package ConditionalOperators.Task12;

import java.util.Scanner;

//Вводится одно действительное число - температура воздуха на улице.
//        Если она меньше, чем 22.4 градуса, то вывести "Холодно(", если больше, то вывести "Тепло!", если ровно 22.4 градуса, то вывести "Прохладно...".
public class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double t = sc.nextDouble();
        if (t < 22.4){
            System.out.println("Холодно(");
        }else if (t == 22.4){
            System.out.println("Прохладно...");
        }else {
            System.out.println("Тепло!");
        }
    }
}
