class Solution {
    public int maxSubArray(int[] nums) {
    int sum = nums[0];
    int current = 0;
        for(int i = 0; i < nums.length; i++){
        if(current<0){
        current = 0;
        }
    current+= nums[i];
        sum = Math.max(sum,current);
    }
    return sum;
    }
}
