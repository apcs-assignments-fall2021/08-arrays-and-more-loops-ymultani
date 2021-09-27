import java.util.Arrays;

public class MyMain {

    // Rotates all values in an array to the left
    // Ex. rotateLeft([1, 2, 3, 4, 5]) => [2, 3, 4, 5, 1]
    public static int[] rotateLeft(int[] arr) {
        int first_term = arr[0];
        int u;
        for (u = 0; u < arr.length - 1; u++) {
            arr[u] = arr[u + 1];
        }
        arr[u] = first_term;
        return arr;
    }



    // Rotates all values in an array to the right
    // Ex. rotateRight([1, 2, 3, 4, 5]) => [5, 1, 2, 3, 4]
    public static int[] rotateRight(int[] arr) {
            int temp = arr[arr.length-1];
            for (int i = (arr.length - 2); i >= 0; i--) {
                arr[i + 1] = arr[i];
            }

            arr[0] = temp;
            return arr;
        }


    // Replaces all duplicate values with -1
    // Ex. duplicateReplacer([1, 2, 1, 2, 1, 1]) => [1, 2, -1, -1, -1, -1]
    public static int[] duplicateReplacer(int[] arr) {
        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j< arr.length; j++){
                if(arr[i]==arr[j]){
                    arr[j] = -1;
                }
            }
        }
        return arr;
    }


    public static void main(String[] args) {
        // YOUR CODE HERE
    }
}
