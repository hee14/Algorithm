import static java.lang.Math.min;
import static java.lang.Math.sqrt;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int x, y, D, T = 0;
        System.out.println("숫자 4개를 입력하세요.");
        x = input.nextInt();
        y = input.nextInt();
        D = input.nextInt();
        T = input.nextInt();
        double dis = sqrt(x*x + y*y);
        double time1 = 0, time2 = 0;
        int jumpNum = (int) dis/D;

        if (dis >= D) {
            time1 = (jumpNum*T) + dis-(jumpNum*D);
            // time2 = (jumpNum+1)*T + ((jumpNum+1)*D)-dis;
            time2 = (jumpNum+1) * T;
            System.out.println("걸리는 시간: " + min(min(time1, time2), dis));
            
        } else {
            time1 = T + D - dis;
            time2 = 2 * T;
            System.out.println("걸리는 시간: " + min(min(time1, time2), dis));
        }
        
    }
}
