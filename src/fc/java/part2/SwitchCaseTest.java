package fc.java.part2;

public class SwitchCaseTest {
    public static void main(String[] args) {
        String day = "Sunday";
        switch(day){
            case "Monday":
                System.out.println("월요일입니다.");
                break;
            case "Tuesday":
                System.out.println("화요일입니다.");
                break;
            case "Wednesday":
                System.out.println("수요일입니다.");
                break;
            case "Thursday":
                System.out.println("목요일입니다.");
                break;
            case "Friday":
                System.out.println("금요일입니다.");
                break;
            case "Saturday":
                System.out.println("토요일입니다.");
                break;
            case "Sunday":
                System.out.println("일요일입니다.");
                break;
            default:
                System.out.println("요일이 아닙니다.");
        }
    }
}
