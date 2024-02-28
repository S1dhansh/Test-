import java.util.Arrays;
public class Matrix {

        public static void sortMatrix(int mat[][]) {
            int n = mat.length;
            int temp[] = new int[n*n];
            int k = 0;


            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    temp[k++] = mat[i][j];
                }
            }


            Arrays.sort(temp);

            k = 0;


            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    mat[i][j] = temp[k++];
                }
            }
        }
    }

