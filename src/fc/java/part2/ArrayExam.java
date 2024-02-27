package fc.java.part2;

public class ArrayExam {
    public static void main(String[] args) {
        int a;
        a = 10;
        // 정수 3개를 저장할 변수를 선언하세요
        int[] b = new int[3];
        // 배열 b의 0번째 원소에 10을 저장하세요
        b[0] = 10;
        b[1] = 20;
        b[2] = 30;
        // 배열 b의 0번째 원소를 출력하세요
        int[] x = {1,2,3,4,5};
        for(int i=0; i < x.length; i++){
            System.out.println(x[i]);
        }
        // 아래 char[] 배열에 APPLE 이라는 문자열을 저장하고 출력하세요
        char[] c = {'A', 'P', 'P', 'L', 'E'};
        for(int i=0; i < c.length; i++){
            System.out.println(c[i]);
        }
    }
}
