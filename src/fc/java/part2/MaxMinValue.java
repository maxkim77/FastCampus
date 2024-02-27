package fc.java.part2;

public class MaxMinValue {
    public static void main(String[] args) {
       // 삼항 연산자를 이용하여 정수 2개 중 max value 와 min value를 구하시오.
         int a = 10;
         int b = 20;
         //min value
        int min = (a < b) ? a : b;
        System.out.println("min value is " + min);
        //max value
        int max = (a > b) ? a : b;
        System.out.println("max value is " + max);
    }
}
