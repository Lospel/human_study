package Training2.배열의_합_구하기;

public class ArraySum {
    public static int sum(int[] numbers) {
        int sum = 0;
        /* 해당 메소드를 구현하세요 */
        for (int i=0; i<numbers.length; i++){
            sum += numbers[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * i;
        }
        System.out.printf("총합: %d\n", sum(arr));
    }
}
