package fc.java.part2;

public class CallByReference {
    public static void main(String[] args) {
        float a = 56.7f;
        float b = 46.7f;

    }
    public static void floatAdd(float a, float b){
        float sum = a+b;
        System.out.println("sum = "+ sum);
    }
}
