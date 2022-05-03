package www.xuan.test;

import java.util.Scanner;

public class Test_Swap {
    public static void main(String[] args) {
        int a = 0, b = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入a的值：\n");
        a = scanner.nextInt();
        System.out.print("请输入b的值：\n");
        b = scanner.nextInt();
        System.out.println("交换前：" + a + " " + b);
        int[] arr = new int[2];
        arr[0] = a;
        arr[1] = b;
//        swap1(a, b);
        swap1(arr);
        System.out.println("交换后：" + arr[0] + " " + arr[1]);

    }

    static void swap1(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
    }

    static void swap1(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }
}