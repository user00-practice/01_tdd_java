package tdd;

public class LeapYear {

    public static boolean isLeapYear(int year) {
        // サイクル1 Green：2023年のテストが加わったので、本当の条件を書く
        return year % 4 == 0;
    }
}
