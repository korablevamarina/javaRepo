package lesson3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"a", "b", "c"};
        method(arr,0, 1);

        System.out.println(Arrays.toString(arr));
    }
    private static void method(Object[] arr, int x, int y) {
        Object buf = arr[x];
        arr[x] = arr[y];
        arr[y] = buf;
    }

}
