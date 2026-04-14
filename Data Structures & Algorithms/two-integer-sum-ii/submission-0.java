class Solution {
    public int[] twoSum(int[] numbers, int target) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        
        // Loop through all possible pairs of numbers in the array
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    nums.add(i+1);  
                    nums.add(j+1);
                    return nums.stream().mapToInt(Integer::intValue).toArray(); // Convert ArrayList to int[]
                }
            }
        }
        
        // If no such pair is found, return an empty array or handle as needed
        return new int[] {}; // Return an empty array if no pair found
    }
}