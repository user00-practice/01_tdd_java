package tdd;

public class LeapYear {

    public static boolean isLeapYear(int year) {
        // Refactor：テストが緑のまま、1つの式にまとめる
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}
