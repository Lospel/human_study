package Training2.고득점자_찾기;

public class TopScoreStudent {
    public static int topIndex(int[] scores) {
        /* 가장 높은 성적의 인덱스를 반환하는 함수를 구현하세요. */
        int max=scores[0];
        int maxIndex=0;
        for (int i=0; i<scores.length;i++){
            if (scores[i] > max){
                max = scores[i];
                maxIndex = i;
            }     
        }
        return maxIndex;
    }
    public static void main(String[] args) {
        String[] names = {"Elena","Suzie","John","Emily", "Neda","Kate","Alex","Daniel","Hamilton"};
        int[] scores = {65,74,23,75,68,96,88,98,54};
        int i = topIndex(scores);
        System.out.printf("1등: %s(%d)\n", names[i], scores[i]);
    }
}
