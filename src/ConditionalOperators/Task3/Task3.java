package ConditionalOperators.Task3;

import java.util.Scanner;
// С клавиатуры построчно вводятся три строки. Необходимо определить, все ли он равны. Если да, то вывести "Yes", в противном случае - "No".
public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a  = sc.nextLine();
        String b  = sc.nextLine();
        String c  = sc.nextLine();

        if((a.equals(b)) && ((a.equals(c))) && (b.equals(c))){
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }
    }
}

