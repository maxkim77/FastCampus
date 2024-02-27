package fc.java.part2;

public class TwoDimArrayTest {

    public static void main(String[] args) {
        int[][] a = new int[2][4];
        a[0][0] = 1;
        a[0][1] = 2;
        a[0][2] = 3;
        a[0][3] = 4;

        a[1][0] = 5;
        a[1][1] = 6;
        a[1][2] = 7;
        a[1][3] = 8;

        System.out.println(a[0][0] + "\t" + a[0][1] + "\t" + a[0][2] + "\t" + a[0][3]);
        System.out.println(a[1][0] + "\t" + a[1][1] + "\t" + a[1][2] + "\t" + a[1][3]);
    }

    public static class BreakContinueTest {
        public static void main(String[] args) {
            // Q.char[] c={‘s’,’h’,’u’,’t’,’d’,’o’,’w’,’n’}; 위 배열의 값을 출력 중
            // ‘o’라는 문자를 만나면 반복을 중지하세요
            char[] c={'s','h','u','t','d','o','w','n'};
            for(int i=0;i<c.length;i++){
                if(c[i]=='o') break;
                System.out.println(c[i]);
            }
            // Q. 1~10까지의 수 중 3의 배수의 개수를 구하여 출력하세요.
            int count=0;
            for(int i=1;i<=10;i++){
                if(i%3!=0) continue;
                count++;
            }
            System.out.println(count); // 3 6 9
        }
    }

    public static class CallByReference {
        public static void main(String[] args) {
            float a = 56.7f;
            float b = 46.7f;

        }
        public static void floatAdd(float a, float b){
            float sum = a+b;
            System.out.println("sum = "+ sum);
        }
    }

    public static class CallByREferenceExam {
        public static void main(String[] args) {
            int[] a= {1, 2, 3, 4, 5};
            int result = addArray(a);
            System.out.println(result);
        }
        public static int addArray(int[] arr){
            int sum = 0;
            for (int i : arr) {
                sum += i;
            }
            return sum;
        }
    }

    public static class LoopLoopTest {
        public static void main(String[] args) {
            int index=1;
            for(int i = 0; i <= 10; i++){
                for (int j = 0; j <= 10; j++) {
                    System.out.println(index);
                    index++;
                }
            }
            int[][] a={
                    {1,2,3,4,5},
                    {1,2,3,4,5}
            };
            for(int i=0; i<2; i++){
                for(int j=0; j<5; j++){
                    System.out.println(a[i][j] + "\t");
                }
                System.out.println(); //줄 바 + "
            }
        }
    }

    public static class MethodMakeTest {
        public static void main(String[] args) {
            int a = 3;
            int b = 4;
            int sum = a+b;
            System.out.println("sum = "+ sum);
        }
        public void add(int a, int b){
            int sum = a+b;
            System.out.println("sum = "+ sum);
        }
    }

    public static class OverloadingTest {
        public static void main(String[] args) {
            float v=add(35.6f, 56.7f);
            System.out.println("v = " + v);
            int vv=add(10,50);
            System.out.println("vv = " + vv);
        }
        // Q. 매개변수로 두개의 정수 값을 받아서 / 총합을 구하여 / 리턴 하는 / [메서드를 정의] 하세요
        public static int add(int a,int b){
            int sum=a+b;
            return sum;
        }
        // Q. 매개변수로 두개의 실수 값을 받아서 / 총합을 구하여 / 리턴 하는 / [메서드를 정의] 하세요.
        public static float add(float a,float b){
            float sum=a+b;
            return sum;
        }
    }
}