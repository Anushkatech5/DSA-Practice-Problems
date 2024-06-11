//Relative Sort Array

class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {

        //find the maximum value in arr1 to size our counting array properly
        int length = 0;
        for( int i = 0; i < arr1.length; i++)
        {
            length = Math.max(length, arr1[i]);
        }

        //create a count array where each index represents the frequency of the corresponding number in arr1
        int[] count = new int[length + 1];
        for( int i = 0; i < arr1.length; i++) {
            count[arr1[i]]++;
        }

        //For each element in arr2, place it in the result array ans according to its frequency in arr1
        int[] ans = new int[arr1.length];
int index = 0;
for (int i = 0; i < arr2.length; i++) {
    while (count[arr2[i]] > 0) {
        ans[index] = arr2[i];
        index++;
        count[arr2[i]]--;
        }
}

        //Place Remaining Elements in Sorted Order
        for (int i = 0; i < count.length; i++) {
    while (count[i] > 0) {
        ans[index] = i;
        index++;
        count[i]--;
    }
}
    return ans;
    }
}
