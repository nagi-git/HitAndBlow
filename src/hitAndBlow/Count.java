package hitAndBlow;

/**
 * ヒットとブロウを数えるクラス
 */
public class Count {

	/**
	 * ヒットを数える
	 * @param correctAnswerNum 正解の数字
	 * @param inputAnswerNum 入力した数字
	 * @return hitCount ヒットの数
	 */
	public static int countHit(int[] correctAnswerNum, int[] inputAnswerNum) {
		int hitCount = 0;
		for (int i = 0; i < 4; i++) {
			if (correctAnswerNum[i] == inputAnswerNum[i]) {
				hitCount += 1;
			}
		}
		return hitCount;
	}

	/**
	 * ブロウを数える
	 * @param correctAnswerNum 正解の数字
	 * @param inputAnswerNum 入力した数字
	 * @return blowCount ブロウの数
	 */
	public static int countBlow(int[] correctAnswerNum, int[] inputAnswerNum) {
		int blowCount = 0;
		for (int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				if (correctAnswerNum[i] == inputAnswerNum[j]) {
					blowCount += 1;
				}
			}
		}
		return blowCount - Count.countHit(correctAnswerNum, inputAnswerNum);
	}
}
