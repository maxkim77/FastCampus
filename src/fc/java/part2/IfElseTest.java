package fc.java.part2;

import java.util.Scanner;
public class IfElseTest {
    public static void main(String[] args) {
//        int x = 10;
//        if (x >= 0) {
//            System.out.println("0 or 양수입니다.");
//        } else {
//            System.out.println("음수입니다.");
//        }
//        // Q. 정수 1개를 입력받아 짝수인지 홀수인지 판단하는 프로그램을 만드세요.
//        Scanner scan = new Scanner(System.in);
//        System.out.print("정수를 입력하세요: ");
//        int num = scan.nextInt();
//        if (num % 2 == 0) {
//            System.out.println("짝수입니다.");
//        } else {
//            System.out.println("홀수입니다.");
//        }
        // Q 80점 이상의 학생 중에서 90점 이상은 A반, 85점이상은 B반
        // 그렇지 않으면 C반으로 배정하는 프로그램을 만드세요.
        // 단 점수는 0~100사이값으로 입력받는다.
        int jumsu = 800;
        if (jumsu >= 0 && jumsu <= 100) {
            if(jumsu>=80){
                if (jumsu >= 90) {
                    System.out.println("A반");
                } else if (jumsu >= 85) {
                    System.out.println("B반");
                } else {
                    System.out.println("C반");
                }
            } else {
                System.out.println("점수를 잘못 입력하셨습니다.");
            }
        }else{
            System.out.println("유효한 점수가 아닙니다.");
        }
    }
}