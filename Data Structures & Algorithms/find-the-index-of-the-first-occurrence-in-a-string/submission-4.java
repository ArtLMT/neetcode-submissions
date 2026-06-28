class Solution {
    public int strStr(String haystack, String needle) {

        String temp;
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.charAt(i) ==  needle.charAt(0)) {
                temp = haystack.substring(i, i + needle.length());
                if (temp.equals(needle)) {
                    return i;
                }
            }
        }

        return -1;
    }
}