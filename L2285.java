//Maximum Total Importance of Roads

class Solution {
    public long maximumImportance(int n, int[][] roads) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            //Adjacency List
            adj.add(new ArrayList<>());
        }

        for(int[] road: roads) {
            adj.get(road[0]).add(road[1]);
            adj.get(road[1]).add(road[0]);
        }

        // int[] => 0:city_num, 1:no_of_nbrs
        List<int[]> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            list.add(new int[] { i,adj.get(i).size()});
        }

        Collections.sort(list, (l1, l2)->l1[1]-l2[1]);
        Map<Integer, Integer> cityToValue = new HashMap<>();
        for(int i = 0; i < n; i++) {
            cityToValue.put(list.get(i)[0], i+1);
        }
        long ans = 0;
        for(int[] road: roads) {
            ans += cityToValue.get(road[0]);
            ans += cityToValue.get(road[1]);
        }
        return ans;
    }
}
