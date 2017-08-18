import java.util.Arrays;
public class Arraysss{
    public static void main(String[] args) {
        //int[] arr = new int[10];
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr1 = new int[]{0, 1, 2, 4};
        //it's OK.
        int[] arr2 = new int[0];
        //Exception in thread "main" java.lang.NegativeArraySizeException
        //int[] arr3 = new int[-1];
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println("======");
        // just like [I@15db9742
        System.out.println(arr);
        //output is [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
        System.out.println(Arrays.toString(arr));
        System.out.println("======");
        for(int val : arr1){
            System.out.println(val);
        }

    }
}