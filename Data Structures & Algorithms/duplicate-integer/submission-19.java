class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> nonDups = new HashSet<>();

        for (int i : nums) {
            nonDups.add(i);
        }
        return nonDups.size() != nums.length;
    }
}