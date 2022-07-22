package ConditionalOperators.Task9;

import java.util.Scanner;
//С клавиатуры построчно вводятся три строки. Если среди них есть ровно две равные строки то вывести "Yes", в противном случае - "No".
public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a  = sc.nextLine();
        String b  = sc.nextLine();
        String c  = sc.nextLine();

        if((a.equals(b) && !a.equals(c)) || (b.equals(c) && !b.equals(a)) || (c.equals(a) && !c.equals(b))){
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }
    }
}
