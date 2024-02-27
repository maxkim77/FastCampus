package fc.java.part2;

import java.util.Scanner;
public class IfbasicTest {
    public static void main(String[] args) {
        // Q. x의 값이 0 보다 큰 경우에만 양수입니다. 출력
        int x = -10;
        if (x>0) {
            System.out.println("x is positive");
        }

        // Q. 정수 1개를 입력받아 입력된 수 가 7의 배수인지 판별하는 코드를 작성하시오.
        Scanner scan=new Scanner(System.in);
        System.out.println("정수를 입력하세요.");
        int num = scan.nextInt();
        if(num%7==0){
            System.out.println("num = " + num + "은 7의 배수입니다.");
        }
        System.out.println("종료");
    }
}
