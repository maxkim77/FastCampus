package fc.java.part2;

public class ForLoopTest {
    public static void main(String[] args) {
        for(int i = 0; i <= 10; i++){
            System.out.println(i);
        }
        for(char c = 'a'; c <= 'z'; c++){
            System.out.println(c);
        }

        for(int i = 65; i <= 90; i++){
            System.out.println((char)i+":"+i);
        }
        //Q. int[] numbers={1,2,3,4,5,6,7,8,9,10}; 배열 numbers의 모든 요소를 출력하는 for문을 작성하시오.
        int[] numbers={1,2,3,4,5,6,7,8,9,10};
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
