package tdd;

public class LeapYear {

    public static boolean isLeapYear(int year) {
        // サイクル2 Green：100で割り切れる年を除く
        if (year % 100 == 0) {
            return false;
        }
        return year % 4 == 0;
    }
}
