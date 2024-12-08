package ARRAY;
//Given an array of size N.
// The task is to find the maximum and the minimum element of the array using the minimum number of comparisons

public class Arrayleet {
    public static int setmini(int A[], int N)
    {
        int mini = Integer.MAX_VALUE;
        for(int i=0 ;i<N;i++){
            if(A[i] < mini){
                mini = A[i];

            }
        }
        return mini;
    }
    public static int setmax(int A[], int N)
    {
        int max = Integer.MIN_VALUE;
        for(int i=0; i<N;i++){
            if(A[i]>N){
                max = A[i];

            }
        }
        return max;
    }
    public static void main(String[] args){
        int A[] = {45,78,56,98,64};
        int N = A.length;
        System.out.println("MINIMUM ELEMENT OF ARRAY :"+setmini(A,N));
        System.out.println("MAXIMUM ELEMENT OF ARRAY :"+setmax(A,N));


    }


}