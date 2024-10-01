package arrays_hashes;

/**
 * Given an integer array nums, return true if any value appears at least twice in the array, 
 * and return false if every element is distinct.
 */

class Solution_00217 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> cache = new HashSet<>();

        for (int i : nums) {
            if (cache.contains(i)) {
                return true;
            }
            cache.add(i);
        }

        return false;
    }
}