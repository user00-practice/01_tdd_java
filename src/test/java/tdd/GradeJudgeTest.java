package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * 演習2：GradeJudge のテスト
 *
 * ハンドアウトのワークシートに「どの点数を試すか」を書き出してから、
 * 1つずつテストを追加 → 実行（赤）→ 実装（緑）をくり返しましょう。
 */
class GradeJudgeTest {

    // ---- 書き方の見本（このテストは最初から用意してあります） ----
    @Test
    void 点数95はA() {
        assertEquals("A", GradeJudge.judge(95));
    }

    // TODO: ワークシートに書いた点数のテストを、下に1つずつ追加していく
    //
    //   書き方のひな形（コピーして、□ の部分を書きかえる）
    //
    //   @Test
    //   void 点数□□は□() {
    //       assertEquals("□", GradeJudge.judge(□□));
    //   }
    //
    //   【チャレンジ】範囲外の点数（-1 や 101）でエラーにしたいときは
    //
    //   @Test
    //   void 点数マイナス1はエラー() {
    //       assertThrows(IllegalArgumentException.class, () -> GradeJudge.judge(-1));
    //   }

}
