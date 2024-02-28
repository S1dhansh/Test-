public class BinarySearchUsingRecusion {
    public static int binarySearch(int[] arr, int a, int b, int num) {
   //here int a= start , int b = end
        if (b < a) {
            return -1;
        }
        int n = a + (b - a) / 2;
        if (arr[n] == num) {
            return n;
        } else if (arr[n] > num) {
            return binarySearch(arr, a, n - 1, num);
        } else {
            return binarySearch(arr, n + 1, b, num);
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40};
        int n = arr.length;
        int x = 10;
        int result = binarySearch(arr, 0, n - 1, x);
        if (result == -1) {
            System.out.println("Element not present");
        } else {
            System.out.println("Element found at index " + result);
        }
    }
}


