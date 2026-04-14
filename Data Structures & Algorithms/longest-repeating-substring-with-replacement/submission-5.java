class Solution {
    public int characterReplacement(String s, int k) {
       HashMap<Character, Integer> freqMap = new HashMap<Character, Integer>();
         int left = 0;
         int maxCount = 0;  //max count for the window
         int maxLength = 0;

         for (int right = 0; right < s.length(); right++) {
          char currentChar = s.charAt(right);

            freqMap.put(currentChar, freqMap.getOrDefault(currentChar, 0) + 1);


           maxCount = Math.max(maxCount, freqMap.get(currentChar));

            int windowSize = right - left + 1;


            if (windowSize - maxCount > k) {
             char leftChar = s.charAt(left);
              freqMap.put(leftChar, freqMap.get(leftChar) - 1);
              left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);


          
        }
         return maxLength;
    }
}

