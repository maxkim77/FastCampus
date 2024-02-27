package fc.java.part2;

import java.util.Date;

public class MovieTest {
    public static void main(String[] args) {
        Movie m = new Movie();
        m.영화제목 = "어벤져스";
        m.개봉일 = new Date(122, 11, 14);
        m.주인공 = "아이언맨";
        m.장르 = "액션";
        m.러닝타임 = 120;
        m.등급 = "12세이상관람가";
        System.out.println(m.영화제목+"\t"+m.개봉일+"\t"+m.주인공+"\t"+m.장르+"\t"+m.러닝타임+"\t"+m.등급);
    }


}
