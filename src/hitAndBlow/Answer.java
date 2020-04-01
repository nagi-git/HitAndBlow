package hitAndBlow;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Answer {

	public static int[] createCorrectAnswer() {
        // 乱数を入れるための配列
    	int[] correctAnswerNum = new int[4];

    	List<Integer> list = new ArrayList<>();
    	for(int i = 0 ; i < 10 ; i++) {
            list.add(i);
        }

    	// シャッフルして、順番を変える
    	Collections.shuffle(list);

        //4つ取り出しanswer配列に入れる
        for(int i = 0; i < correctAnswerNum.length; i++){
        	correctAnswerNum[i] = list.get(i);
            System.out.print(correctAnswerNum[i]); // TODO 後で削除する
        }
        return correctAnswerNum;
	}

}

