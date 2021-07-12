import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];
        int num = 0;

        System.out.println("숫자 5개를 입력하세요.");

        for (int i=0; i<numbers.length; i++) {
            numbers[i] = input.nextInt();
            numbers[i] *= numbers[i];
            num += numbers[i]; 
        }

        System.out.println(num%10);
        
    }
}
