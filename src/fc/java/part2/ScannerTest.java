package fc.java.part2;

import java.util.*;
public class ScannerTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("정수를 입력하세요: ");
        int num=scan.nextInt(); // 블럭상태
        System.out.println("num = " + num);

        System.out.println("실수를 입력하세요: ");
        float f = scan.nextFloat();
        System.out.println("f = " + f);

        System.out.println("문자열을 입력하세요: ");
        String str = scan.next();
        System.out.println("str = " + str);
    }
}
