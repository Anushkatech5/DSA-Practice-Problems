//Subarray Sums Divisible by K

import java.util.Arrays;

class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int[] modCnt = new int[k];
        Arrays.fill(modCnt, 0);
        int curMod = 0;
        int subCnt = 0;
        modCnt[0] = 1;

        for (int num : nums) {
            curMod = ((curMod + num % k) + k) % k;
            subCnt += modCnt[curMod];
            modCnt[curMod]++;
        }

        return subCnt;
    }
}
