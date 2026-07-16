class Solution {
    public int[] twoSum(int[] nums, int target) {
        Scanner sc = new Scanner(System.in);
        int count=0;
        int[] arr=new int[2];
        for(int i=0;i<nums.length;i++){
            int diff = target - nums[i];
            for(int j=i+1;j<nums.length;j++){
                if(diff==nums[j]){
                arr[count++]=i;
                arr[count++]=j;
                }
            }
        }
        return arr;
    }
}
