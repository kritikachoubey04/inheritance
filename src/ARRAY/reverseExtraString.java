//Create a new array of the same size as the original array.
//
// Copy elements from the original array to the new array in reverse order.
package ARRAY;
public class reverseExtraString {
    public static void reverseExtraString(int [] arr)
    {
        int Arrreverse[]= new int [arr.length];
        for(int i=0;i<arr.length;i++) {
            Arrreverse[i] = arr[arr.length - i - 1];
        }
             System.out.println("Reversed Array: ");
             for(int i :Arrreverse){
                 System.out.println(i + " ");

             }

    }
    public static void main(String[] args)
    {
        int[] originalArr = {1,2,3,4,5,6,7};
        reverseExtraString(originalArr);
    }

}
