//Group the People Given the Group Size They Belong To

class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        HashMap<Integer, List<Integer>> groups = new HashMap<>();
        List<List<Integer>> ans = new ArrayList<>();
        
        for (int i = 0; i < groupSizes.length; i++) {
            int size = groupSizes[i];
            groups.computeIfAbsent(size, k -> new ArrayList<>()).add(i);
            if (groups.get(size).size() == size) {
                ans.add(new ArrayList<>(groups.get(size)));
                groups.get(size).clear();
            }
        }
        
        return ans;
    }
}
