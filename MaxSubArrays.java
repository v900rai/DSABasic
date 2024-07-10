package July2024;

public class MaxSubArrays {
    public static void main(String[] args) {
     int []nums={-2,1,-3,4,-1,-5,4};
        System.out.println(maxSubArrays(nums));
    }
    public static int maxSubArrays(int nums[]){
        int sum=0;
        int max_sum=nums[0];
        for(int i=0; i<nums.length; i++){
            for(int j=i; j<nums.length; j++){
                sum+=nums[j];
                max_sum=Math.max(max_sum, sum);
            }
            if(sum<0){
                sum=0;
            }
        }

        return sum;
    }
}
