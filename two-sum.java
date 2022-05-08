class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer,Integer> map = new HashMap();
        
        //fill hashmap
        for(int i = 0;i<nums.length;i++){
            map.put(nums[i],i);
        }
         for(int i = 0;i<nums.length;i++){//2.7.11.15
             int num = nums[i];//2
             int rem = target-num;//7
             if(map.containsKey(rem)){
                 int index = map.get(rem);
                 if(index==i)continue;
                 return new int[]{i,index};
             }
         }
        return new int[]{};
    }
}
// the below is the brute force solution 
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i= 0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        throw new IllegalArgumentException("no solution.");
    }
}
