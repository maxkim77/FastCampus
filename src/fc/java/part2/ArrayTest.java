package fc.java.part2;

public class ArrayTest {
    public static void main(String[] args) {
        // 실수 5개를 저장할 배열을 생성 모든원소에 10을 저장하고 출력
        float[] f = new float[5];
        f[0] = 10.5f;
        f[1] = 15.5f;
        f[2] = 50.5f;
        f[3] = 70.5f;
        f[4] = 88.5f;
        for (int i = 0; i < f.length; i++) {
            System.out.println(f[i]);
        }
        // 정수 5개를 아래처럼 배열에 초기화하고 index 0번째와 3번째를 더하여 출력
        int[] a = { 10, 20, 30, 40, 50 };
        for (int j = 0; j < a.length; j++) {
            System.out.println(a[j]);
        }
        int sum= a[0] + a[3];
        System.out.println(sum);
        System.out.println(a.length);
        // 실수 3개를 저장할 배열을 생성하고 출력
        float[] b = new float[3];
        System.out.println(b[0]);
        System.out.println(b[1]);
        System.out.println(b[2]);
    }
}
