package tdd;

/**
 * 演習1 解答：うるう年を判定するクラス（Refactor後の最終形）
 */
public class LeapYear {

    /**
     * 西暦 year がうるう年なら true、うるう年でなければ false を返す。
     * ・4で割り切れて、100で割り切れない年はうるう年
     * ・400で割り切れる年はうるう年
     */
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}
