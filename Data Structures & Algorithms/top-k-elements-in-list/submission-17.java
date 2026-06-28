class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] output = new int[k];

        for (int num : nums) {
            map.merge(num, 1, Integer::sum);
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());

        list.sort((a, b) -> b.getValue() - a.getValue());

        for (int i = 0; i < k; i++) {
            output[i] = list.get(i).getKey();
        }

        return output;
    }
}
