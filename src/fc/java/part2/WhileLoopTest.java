package fc.java.part2;

public class WhileLoopTest {
    public static void main(String[] args) {
        int i = 0;
        while(i <= 10){
            System.out.println(i);
            i++;
        }
        char c = 'a';
        while(c <= 'z'){
            System.out.println(c);
            c++;
        }
        int j = 65;
        while(j <= 90){
            System.out.println((char)j+":"+j);
            j++;
        }
        //Q. int[] numbers={1,2,3,4,5,6,7,8,9,10}; 배열 numbers의 모든 요소를 출력하는 while문을 작성하시오.
        int[] numbers={1,2,3,4,5,6,7,8,9,10};
        int k = 0;
        while(k < numbers.length){
            System.out.println(numbers[k]);
            k++;
        }
    }
}
