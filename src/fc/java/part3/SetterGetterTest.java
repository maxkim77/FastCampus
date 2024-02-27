package fc.java.part3;

import fc.java.model.PersonVo;

public class SetterGetterTest {

    public static void main(String[] args) {
        PersonVo vo = new PersonVo();
        vo.setName("홍길동");
        vo.setAge(50);
        vo.setPhone("010-1111-1111");
        System.out.println(vo.getName() + "\t" + vo.getAge() + "\t" + vo.getPhone());
    }
}
