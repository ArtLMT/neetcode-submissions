class Solution {
    public int[] replaceElements(int[] arr) {
        int highest = -1;

        // Step 1: Initialize the maximum value seen so far to -1
        int maxSoFar = -1;
        
        // Step 2: Loop through the array backwards
        for (int i = arr.length - 1; i >= 0; i--) {
            // Step 3: Store the current element before we overwrite it
            int currentVal = arr[i];
            
            // Step 4: Overwrite the current element with the max seen to its right
            arr[i] = maxSoFar;
            
            // Step 5: Update maxSoFar if the element we just replaced was larger
            maxSoFar = Math.max(maxSoFar, currentVal);
        }
        
        return arr;
    }
}