package ConditionalOperators.Task11;
//Яша плавал в бассейне размером N×M метров и устал. В этот момент он обнаружил,
//        что находится на расстоянии x метров от одного из длинных бортиков (не обязательно от ближайшего) и y метров от одного из коротких бортиков.
//        Какое минимальное расстояние должен проплыть Яша, чтобы выбраться из бассейна на бортик?
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        if((x < y) & (x < n / 2)){
            System.out.println(x);
        }else if((x < y) & (x > n / 2)){
            System.out.println(n - x);
        }else if((x > y) & (y < m / 2)){
            System.out.println(y);
        }else{
            System.out.println(m - y);
        }
    }
}
