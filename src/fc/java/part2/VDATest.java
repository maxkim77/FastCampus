package fc.java.part2;

public class VDATest {
    public static void main(String[] args) {
        // Q1. 한개를 저장하기 위해서 변수를 선언
        int v;
        v=10;
        System.out.println("v = " + v);

        //  Q2. 한개의 변수에 다른 변수의 값을 저장
        int a= 10;
        int b=a;
        int c=b *10;
        System.out.println("c = " + c);

        // 누적 출력
        int sum = 0;
        sum = sum + 1;
        sum = sum + 2;
        sum = sum + 3;
        sum = sum + 4;
        sum = sum + 5;
        System.out.println("sum = " + sum);

        // 서로 교환 출력
        int x = 10;
        int y = 20;
        System.out.println("x = " + x +":" + "y = " + y);
        int tmp;
        tmp = y;
        y=x;
        x=tmp;
        System.out.println("x = " + x +":" + "y = " + y);



    }
    
    
}
