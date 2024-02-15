import java.util.*;
public class MaxValueInArray {
    public static int findMax(int num[]){
        int maxNum=Integer.MIN_VALUE;
        for(int i =0;i<num.length;i++){
            if (maxNum < num[i]) {
                maxNum=num[i];
            }
        }
        return maxNum;
    }
    public static void main(String args []){
          int arr []={5,10,20,15};
          int result= findMax(arr);
          for(int i=0;i< arr.length;i++ ){}
        System.out.println(result);
      }
}
