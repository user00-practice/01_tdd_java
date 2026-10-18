package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * 演習2 解答：境界値（区切りの両側）を中心にテストする
 */
class GradeJudgeTest {

    @Test
    void 点数95はA() {
        assertEquals("A", GradeJudge.judge(95));
    }

    // ---- A と B の境目 ----
    @Test
    void 点数100はA() {
        assertEquals("A", GradeJudge.judge(100));
    }

    @Test
    void 点数90はA() {
        assertEquals("A", GradeJudge.judge(90));
    }

    @Test
    void 点数89はB() {
        assertEquals("B", GradeJudge.judge(89));
    }

    // ---- B と C の境目 ----
    @Test
    void 点数80はB() {
        assertEquals("B", GradeJudge.judge(80));
    }

    @Test
    void 点数79はC() {
        assertEquals("C", GradeJudge.judge(79));
    }

    // ---- C と D の境目 ----
    @Test
    void 点数70はC() {
        assertEquals("C", GradeJudge.judge(70));
    }

    @Test
    void 点数69はD() {
        assertEquals("D", GradeJudge.judge(69));
    }

    // ---- D と F の境目 ----
    @Test
    void 点数60はD() {
        assertEquals("D", GradeJudge.judge(60));
    }

    @Test
    void 点数59はF() {
        assertEquals("F", GradeJudge.judge(59));
    }

    @Test
    void 点数0はF() {
        assertEquals("F", GradeJudge.judge(0));
    }

    // ---- チャレンジ：範囲外 ----
    @Test
    void 点数マイナス1はエラー() {
        assertThrows(IllegalArgumentException.class, () -> GradeJudge.judge(-1));
    }

    @Test
    void 点数101はエラー() {
        assertThrows(IllegalArgumentException.class, () -> GradeJudge.judge(101));
    }
}
