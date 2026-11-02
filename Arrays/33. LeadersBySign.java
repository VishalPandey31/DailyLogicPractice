import java.util.*;

class A {
    public static void main(String[] args) {

        int arr[] = {10, 22, 12, 3, 0, 6};

        ArrayList<Integer> val = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            boolean leader = true;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] < arr[j]) {
                    leader = false;
                    break;
                }
            }

            if (leader == true) {
                val.add(arr[i]);
            }
        }

        System.out.println(val);
    }
}