//Minimum Operations to Make Array Equal to Target

class Solution {
    public long minimumOperations(int[] nums, int[] target) {
        List<Integer> a = Arrays.stream(nums).boxed().collect(Collectors.toList());
        List<Integer> b = Arrays.stream(target).boxed().collect(Collectors.toList());
        
        int n = a.size() + 1;
        a.add(0);
        b.add(0);
        
        long add = 0, sub = 0;
        for (int i = 0; i < n; i++) {
            int diff1 = a.get(i);
            int diff2 = b.get(i);
            if (i > 0) {
                diff1 -= a.get(i - 1);
                diff2 -= b.get(i - 1);
            }
            if (diff1 < diff2) {
                add += (diff2 - diff1);
            } else {
                sub += (diff1 - diff2);
            }
        }
        return add;
    }
}
