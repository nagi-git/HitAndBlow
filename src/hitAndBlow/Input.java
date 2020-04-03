package hitAndBlow;

import java.util.Scanner;

/**
 * ユーザー入力させるクラス
 */
public class Input {
	/**
	 * ユーザーが入力する
	 * @return inputNum ユーザーが入力した値
	 */
	public static int[] inputAnswer() {
		Scanner sc = new Scanner(System.in);

		// 標準入力から値を取得する
		int[] inputNum = new int[4];

		String inputString = sc.nextLine();
		for (int i = 0; i < 4; i++) {
			inputNum[i] = Integer.valueOf(inputString.substring(i, i + 1));
		}
		return inputNum;
	}
}
