package fc.java.part2;

public class TwoDimArrayInit {
    // 2차원 배열의 초기화와 반복 활용 원소접근
    public static void main(String[] args) {
    int[][] a = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
    };
    for(int i=0;i<a.length;i++){
        for(int j = 0; j < a[i].length; j++) {
            System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    int[][] b = new int[3][3];
    b[0] = new int[1];
    b[1] = new int[2];
    b[2] = new int[3];
    b[3] = new int[4];
    b[4] = new int[5];
    for(int i=0;i<b.length;i++){
        for(int j = 0; j < b[i].length; j++) {
            System.out.print(b[i][j] + "\t");
            }
            System.out.println();
        }
    }
}