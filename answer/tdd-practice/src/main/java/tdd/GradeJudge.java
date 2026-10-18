package tdd;

/**
 * 演習2 解答：点数から成績（A〜F）を判定するクラス
 */
public class GradeJudge {

    /**
     * 点数 score（0〜100）から成績を返す。
     * 90〜100:A / 80〜89:B / 70〜79:C / 60〜69:D / 0〜59:F
     * 範囲外の点数は IllegalArgumentException（チャレンジ課題）
     */
    public static String judge(int score) {
        if (score < 0 || score > 100) {
            throw new IllegalArgumentException("点数は0〜100で指定してください: " + score);
        }
        if (score >= 90) {
            return "A";
        }
        if (score >= 80) {
            return "B";
        }
        if (score >= 70) {
            return "C";
        }
        if (score >= 60) {
            return "D";
        }
        return "F";
    }
}
