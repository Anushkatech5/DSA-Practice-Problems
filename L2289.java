// Steps to Make Array Non-decreasing

class Solution {
    public int totalSteps(int[] nums) {
        Stack st = new Stack<Integer>();
        st.push(0);
        int steps=0;
        int step_arr[] = new int[nums.length]; 
        for(int i=1;i<nums.length;i++){
            int max_steps = 0;
            while(!st.empty() && nums[i]>=nums[(Integer)st.peek()]){
                max_steps=Math.max(max_steps,step_arr[(Integer)st.peek()]);
                st.pop();
            }
            if(!st.empty() && nums[i]<nums[(Integer)st.peek()]){
                    step_arr[i]=1+max_steps;
            }
            steps = Math.max(steps,step_arr[i]);
            st.push(i);
        }
        return steps;
    }
}
