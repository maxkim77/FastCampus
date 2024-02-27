package fc.java.part2;

public class CallByREferenceExam {
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
