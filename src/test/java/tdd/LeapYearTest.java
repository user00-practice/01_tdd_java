package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * 演習1：LeapYear のテスト
 *
 * 1つ書くたびに実行して「赤（失敗）」を確認してから、
 * LeapYear.java を書きかえて「緑（成功）」にしましょう。
 */
class LeapYearTest {

    // ---- サイクル1：4で割り切れる年は、うるう年 ----
    @Test
    void 西暦2024年はうるう年() {
        assertTrue(LeapYear.isLeapYear(2024));
    }

    // TODO サイクル1の続き：「西暦2023年はうるう年ではない」テストを書く
    //   ヒント：「〜ではない」を確かめるときは assertFalse(...) を使う


    // TODO サイクル2：「西暦1900年はうるう年ではない」テストを書く
    //   （100で割り切れる年は、うるう年ではない）


    // TODO サイクル3：「西暦2000年はうるう年」テストを書く
    //   （400で割り切れる年は、うるう年）

}
