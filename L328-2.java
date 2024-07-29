//Ugly Number II

class Solution {
    public int nthUglyNumber(int n) {
        int[] uglyNumbers = new int[n];
        uglyNumbers[0] = 1;

        int index2 = 0, index3 = 0, index5 = 0;
        int nextOf2 = 2, nextOf3 = 3, nextOf5 = 5;

        for (int i = 1; i < n; i++) {
            int nextUgly = Math.min(Math.min(nextOf2, nextOf3), nextOf5);
            uglyNumbers[i] = nextUgly;

            if (nextUgly == nextOf2) {
                index2++;
                nextOf2 = uglyNumbers[index2] * 2;
            }
            if (nextUgly == nextOf3) {
                index3++;
                nextOf3 = uglyNumbers[index3] * 3;
            }
            if (nextUgly == nextOf5) {
                index5++;
                nextOf5 = uglyNumbers[index5] * 5;
            }
        }
        return uglyNumbers[n - 1];
    }
}
