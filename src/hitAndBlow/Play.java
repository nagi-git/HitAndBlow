package hitAndBlow;

public class Play {
    public static void main(String[] args) {

        // 乱数を入れるための配列
    	int[] correctAnswerNum = Answer.createCorrectAnswer();

       // 標準入力から値を取得する
    	int[] inputAnswerNum = Input.inputAnswer();

        int hitCount = Count.countHit(correctAnswerNum, inputAnswerNum);
        System.out.println("\n" + hitCount);
    }
}

