package hitAndBlow;

import java.util.Random;

public class Question {
	/** 乱数ジェネレータ */
	Random randFirstNum = new Random();
	Random randSecondNum = new Random();
	Random randThirdNum = new Random();
	Random randForthNum = new Random();

	/**
	 * 0～9の乱数を発生する
	 */
	int randomNumber() {
		return this.randFirstNum.nextInt(9);
		
	}
}
