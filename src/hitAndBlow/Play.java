package hitAndBlow;

/**
 * ヒットアンドブロウを実行するクラス
 */
public class Play {
	public static void main(String[] args) {

		// 乱数を取得する
		int[] correctAnswerNum = Answer.createCorrectAnswer();

		// ヒットの数を初期化
		int hitCount = 0;
		// ターンの回数を初期化
		int turnCount = 0;

		for(int i = 1; !isFinished(hitCount); i++) {
			// 標準入力から値を取得する
			int[] inputAnswerNum = Input.inputAnswer();

			// ヒットの数を取得する
			hitCount = Count.countHit(correctAnswerNum, inputAnswerNum);
			System.out.println("ヒット：" + hitCount);

			// ブロウの数を取得する
			int blowCount = Count.countBlow(correctAnswerNum, inputAnswerNum);
			System.out.println("ブロウ：" + blowCount);

			turnCount += 1;
		}
		System.out.println("おわり");
		System.out.println(turnCount);

	}
	private static boolean isFinished(int hitCount) {
		if (hitCount >= 4) {
			return true;
		} else {
			return false;
		}
	}
}
