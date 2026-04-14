class Solution {
    public boolean isAnagram(String s, String t) {
     char[] myArray1  = s.toCharArray();
        char[] myArray2  = t.toCharArray();
        Arrays.sort(myArray1);
        Arrays.sort(myArray2);
        return new String(myArray1).equalsIgnoreCase(new String(myArray2));
    }
}
