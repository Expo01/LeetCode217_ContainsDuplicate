/* Given an integer array nums, return true if any value appears at least twice in the array, and return
false if every element is distinct.

considerations: Deals with exact value, as opposed to range. Involves numerous exact values, not singular but will
return a boolean if any number is duplicated, do not need to return an array of all dupliates. For efficiency, should
terminate loop once first duplicate found

options:
    map- could iterate through the loop and for each value, put the array value as a map key with index as the map value.
        then perform a map search of 'contains key' and if the key is already found that matches the array value, return
        true and exit loop
    stored variables- i dont think this works. we aren't looking for a new least value to store. we would need to store
        every value, which is not efficient

 */


import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] testArray = {1,3,5,3};
        System.out.println(new Solution().containsDuplicate(testArray));
    }
}

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> myMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (myMap.containsKey(nums[i])) {
                return true;
            } else {
                myMap.put(nums[i], i);
            }
        }
        return false;
    }
}