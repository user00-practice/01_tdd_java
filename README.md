# TDD体験（Java）講師用リポジトリ

「TDD体験（テスト駆動開発をやってみよう）」の教材一式です。このリポジトリは**講師専用**で、
`answer/`・`teacher/` フォルダには受講者に見せない内容（模範解答・進行シナリオ・スライド等）が入っています。
Private リポジトリで運用してください。

- 対象：プログラミング初学者（if 文・`%`（余り）・`return` を学習済みであること）
- 時間：2限（50分×2）
- 言語・環境：Java 17 以降 / JUnit 5 / Maven / IntelliJ IDEA
- 題材：演習1 うるう年判定（講師と一緒に）→ 演習2 成績判定（自分でテストを考える）

## 仕組み：受講者用リポジトリへの自動同期

```
講師用リポジトリ（このリポジトリ：user00-practice/00_tdd_java）
      │ main へ push
      ▼
GitHub Actions（.github/workflows/sync-to-student-repo.yml）
      │ answer/ と teacher/ を除外してコピー
      ▼
受講者用リポジトリ（user00-practice/00_tdd_java-student。手動編集しない）
```

セットアップ手順は [`SETUP.md`](./SETUP.md) を参照してください。

## フォルダ構成

| パス | 内容 | 受講者用への同期 |
|---|---|---|
| `pom.xml` / `src/` | 受講者が使う Maven プロジェクト（TODO 未実装のスターター） | される |
| `.gitignore` | ビルド成果物・IDE設定を除外 | される |
| `STUDENT_README.md` | 受講者用リポジトリの `README.md` になる | される（リネームして） |
| `answer/tdd-practice/` | 模範解答の Maven プロジェクト一式（演習1・2 最終形、全17テスト緑） | **されない** |
| `answer/README.md` | 解答キー（サイクルごとのコードと解説） | **されない** |
| `teacher/scenario.docx` | 進行シナリオ（台本） | **されない** |
| `teacher/handout.docx` | 受講者用ハンドアウト（印刷 / LMS で配布） | **されない** |
| `teacher/slides.pptx` | 解説用スライド（スピーカーノートに講師メモ） | **されない** |
| `teacher/assets/class_logo.png` | クラスロゴ（余白トリミング・背景透過済み。スライド・Word に使用）。`class_logo_original.png` は元画像 | **されない** |
| `teacher/solved/` | 演習1の各サイクル完了時点のコード（cycle1a〜refactor） | **されない** |
| `README.md` / `SETUP.md` | 講師向け説明 | **されない** |

受講者用リポジトリのルートがそのまま Maven プロジェクトになるので、受講者はクローンするだけで
IntelliJ IDEA が `pom.xml` を認識して開けます。

## 講師用の動作確認

`answer/tdd-practice/` を IntelliJ IDEA で別プロジェクトとして開き、`src/test/java` を右クリック →
「すべてのテストを実行」で 17件すべて緑になることを確認してください。
