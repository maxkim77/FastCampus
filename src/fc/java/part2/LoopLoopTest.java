package fc.java.part2;

import java.sql.SQLOutput;

public class LoopLoopTest {
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
