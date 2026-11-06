class A {
    public static void main(String args[]) {

        int arr[] = {7, 2, 5, 10, 8};
        int k = 2;

        int low = 0;
        int high = 0;

        for (int i = 0; i < arr.length; i++) {

            low = Math.max(low, arr[i]);
            high += arr[i];
        }

        int ans = -1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int count = 1;
            int sum = 0;

            for (int i = 0; i < arr.length; i++) {

                if (sum + arr[i] <= mid) {
                    sum += arr[i];
                }
                else {
                    count++;
                    sum = arr[i];
                }
            }

            if (count <= k) {
                ans = mid;
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }

        System.out.println(ans);
    }
}