package tdd;

public class LeapYear {

    public static boolean isLeapYear(int year) {
        // サイクル3 Green：400で割り切れる年はうるう年
        if (year % 400 == 0) {
            return true;
        }
        if (year % 100 == 0) {
            return false;
        }
        return year % 4 == 0;
    }
}
