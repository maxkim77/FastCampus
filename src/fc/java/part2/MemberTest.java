package fc.java.part2;

public class MemberTest {
    // 한명의 헬스클럽 회원 데이터를 저장하고
    public static void main(String[] args) {
        Member m = new Member();
        m.name = "홍길동";
        m.age = 20;
        m.tel = "010-1234-5678";
        m.email = "fc@naver.com";
        m.addr = "서울시 강남구";
        m.weight = 70.5f;
        System.out.println(m.name+"\t"+m.age+"\t"+m.tel+"\t"+m.email+"\t"+m.addr+"\t"+m.weight);
    }

}
