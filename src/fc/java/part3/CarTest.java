package fc.java.part3;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("자동차일련번호:");

        int carSn = input.nextInt();
        input.nextLine();

        System.out.println("자동차이름:");
        String carName = input.nextLine();

        System.out.println("자동차색상:");
        String carColor = input.nextLine();

        System.out.println("자동차가격:");
        int carPrice = input.nextInt();
        input.nextLine();

        System.out.println("자동차타입:");
        String carType = input.nextLine();

        System.out.println(carSn + "\t" + carName + "\t" + carColor + "\t" + carPrice + "\t" + carType + "\t");
    }
}
