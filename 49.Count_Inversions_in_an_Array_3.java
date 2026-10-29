import java.util.*;

class A {
    public static void main(String args[]) {
        int arr[] = {2, 3, 5, 6};
        int arr1[] = {2, 2, 4, 4, 8};

        int finalArr[] = Arrays.copyOf(arr, arr.length + arr1.length);

        System.arraycopy(arr1, 0, finalArr, arr.length, arr1.length);

        Arrays.sort(finalArr);

        System.out.println(Arrays.toString(finalArr));
    }
}