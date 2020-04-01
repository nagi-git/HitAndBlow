package hitAndBlow;

public class Count {

	public static int countHit(int[] correctAnswerNum, int[] inputAnswerNum) {
		int hitCount = 0;
		for (int i = 0; i < 4; i++) {
			if (correctAnswerNum[i] == inputAnswerNum[i]) {
				hitCount += 1;
			}
		}

		return hitCount;
	}

	public static int countBlow(int[] correctAnswerNum, int[] inputAnswerNum) {
		int blowCount = 0;
		for (int i = 0; i < 4; i++) {
			// TODO hitのカウントと同じになっているため、カウント方法を見直す必要がある
			if (correctAnswerNum[i] == inputAnswerNum[i]) {
				blowCount += 1;
			}
		}
		return blowCount;
	}

}
