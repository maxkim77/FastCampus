package fc.java.part2;

public class LogicalOperTest {
    public static void main(String[] args) {
        int x= 1, y = 0;
        System.out.println((x > 0) && (y > 0));
        System.out.println((x > 0) || (y > 0));
        System.out.println(!(x > 0));

        int a = 3, b =5;
        System.out.println((a > 0) && (b > 0));
        System.out.println((a != 3) && (a > 2));
    }
}
