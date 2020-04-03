package hitAndBlow;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 正解を作るクラス
 */
public class Answer {

	/**
	 * 正解の4桁の数字を作成
	 * @return correctAnswerNum 正解の数字
	 */
	public static int[] createCorrectAnswer() {
        // 乱数を入れるための配列
    	int[] correctAnswerNum = new int[4];

    	List<Integer> list = new ArrayList<>();
    	for(int i = 0 ; i < 10 ; i++) {
            list.add(i);
        }

    	// シャッフルして、順番を変える
    	Collections.shuffle(list);

        //4つ取り出しcorrectAnswerNum配列に入れる
        for(int i = 0; i < correctAnswerNum.length; i++){
        	correctAnswerNum[i] = list.get(i);
            System.out.print(correctAnswerNum[i]); // TODO 後で削除する
        }
        System.out.println(); // TODO 後で削除する
        return correctAnswerNum;
	}

}

