package Training2.로또_번호_생성기;

import java.util.Arrays;

public class Number {
    public static int generateNumber(){
        return (int)(Math.random()*45)+1;
    }
    public static void main(String[] args) {
        boolean[] isPicked = new boolean[46];
        int[] pickNumbers = new int[6];
        for(int i=0;i<pickNumbers.length;i++){
            while (true){
                int tempNum = generateNumber();
                if(isPicked[tempNum]==false){
                    isPicked[tempNum] = true;
                    pickNumbers[i] = tempNum;
                    break;
                }
            }
        }
        Arrays.sort(pickNumbers);
        for (int n : pickNumbers){
            System.out.printf("%d ", n);
        }        
    }
}
