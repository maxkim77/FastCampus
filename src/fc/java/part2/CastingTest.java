package fc.java.part2;

public class CastingTest {
    public static void main(String[] args) {
        float f1 = .10f;
        System.out.println("f1 = " + f1);
        float f2 = 1e1f;
        System.out.println("f2 = " + f2);
        float f3 = 3.14e3f;
        System.out.println("f3 = " + f3);
        double d = 1.23456789;
        System.out.println("d = " + d);

        float x = 15.6f;
        int y = (int)x; // 강제형 변환 (손실발생)
        System.out.println("y = " + y); // 15
        char c = 'A';
        int cc = c;
        System.out.println("cc = " + cc); // 65

        int dd = 5;
        double ddd = dd ;
        System.out.println("ddd = " + ddd); // 5.0

        double dx = 14.67;
        int dy = (int)dx;
        System.out.println("dy = " + dy); // 14

    }
}
