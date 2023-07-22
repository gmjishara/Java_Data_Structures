import java.util.Arrays;

class SortArray {
    public void sortArray(int[] arr) {

        for (int j = 0; j < arr.length - 1; j++) {
            int max = arr[0];
            int index = 0;
            for (int i = 1; i < arr.length - j; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                    index = i;
                }
            }
            arr[index] = arr[arr.length - (j + 1)];
            arr[arr.length - (j + 1)] = max;
        }

    }
}

public class Sort {
    public static void main(String[] args) {
        int[] arr = {20, 50, 89, 41, 75, 26, 34, 15, 59, 60, 49, 98};
        SortArray obj = new SortArray();
        obj.sortArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
