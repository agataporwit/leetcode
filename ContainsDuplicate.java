class Solution {
    public boolean containsDuplicate(int[] nums) {
        int count1 = nums.length;
        int count2 = (int)Arrays.stream(nums).distinct().count();
        if(count1!=count2)
            return true;
        else
            return false;
    }
}
