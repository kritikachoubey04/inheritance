package ARRAY;

public class subArray
{
    public static int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int Maxsum = nums[0];
        for(int i = 0;i<nums.length;i++){
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            Maxsum = Math.max(currentSum, Maxsum);
        }
        return Maxsum;
    }
    public static void main(String[] args) {
        int nums[] = {-1, -3, 8, 9, -4, 9, -2};
        int result = maxSubArray(nums);

        System.out.println("MAXIMUM SUM SUB ARRAY  :" + result);
    }
}