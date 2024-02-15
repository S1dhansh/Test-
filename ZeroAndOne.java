public class ZeroAndOne {
    public static int zeroOne(int array[]) {
        int countZero = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
              //  return i;
                countZero++;
            }
            System.out.print( " ");
        }
        return countZero;
    }

    public static void main(String[] args) {
        int testArray[] = {1, 1, 1, 1, 0, 0};
        int result =zeroOne(testArray);

            System.out.println("Total number of zero in the given array is :" + result);
        }
    }



