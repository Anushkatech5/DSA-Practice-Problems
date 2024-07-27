//Sum of Unique Elements

class Solution {
    public int sumOfUnique(int[] nums) {

    HashMap<Integer,Boolean>mp=new HashMap<>();
    HashMap<Integer,Boolean>arr=new HashMap<>();

    int sum=0;

    for(int i=0;i<nums.length;i++){

    if(!mp.containsKey(nums[i])){
        sum+=nums[i];
        mp.put(nums[i],true);
        arr.put(nums[i],true);
    }
    else if(arr.get(nums[i])==true){

    sum-=nums[i];

    arr.put(nums[i],false);
    }
}
   return sum;
        
    }
}
