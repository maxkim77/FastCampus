package fc.java.part3;

import fc.java.model.PersonVO;
public class ToStringPrint {
    public static void main(String[] args) {
        PersonVO vo = new PersonVO("홍길동", 25, "010-1234-5678");
        System.out.println(vo.getName() +"\t"+ vo.getAge()+"\t"+vo.getPhone());
        System.out.println(vo.toString());
    }
}
