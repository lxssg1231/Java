import java.util.Arrays;
import java.util.Random;

public class Maopao {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));
        Maopaopaixu px = new Maopaopaixu();
        arr = px.maopao(arr);
        System.out.println(Arrays.toString(arr));
    }
}

class Maopaopaixu {
    public int[] maopao(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j] < arr[j - 1]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        return arr;
    }
}
