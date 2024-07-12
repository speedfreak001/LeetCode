
// Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.


class FirstOccurrence {
    public int strStr(String haystack, String needle) {

        if(haystack.length() == 1) {
            if(haystack.charAt(0)==needle.charAt(0)) {
                return 0;
            }
        }
        for (int i = 0; i< haystack.length(); i++) {
            if (haystack.startsWith(needle, i)) {
                 return i;
            }
        }
        return -1;
    }
}
