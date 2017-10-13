/*
Background:
Compare two version numbers version1 and version2.
If version1 > version2 return 1, if version1 < version2 return -1, otherwise return 0.

You may assume that the version strings are non-empty and contain only digits and the . character.
The . character does not represent a decimal point and is used to separate number sequences.
For instance, 2.5 is not "two and a half" or "half way to version three", it is the fifth second-level revision of the second first-level revision.


The reason why I choose this code as demo:
The accept rate of this problem is very low which seems odd to me.
I think this program could kind of show my ability of coding

*/

class Solution {
    public int compareVersion(String version1, String version2) {
        return compare(version1, 0, version2, 0);        
    }

    private int compare(String version1, int i1, String version2, int i2) {
        if (i1 >= version1.length() && i2 >= version2.length()) return 0;
		
        int v1 = 0, v2 = 0;
        // calculate v1.
        int i = 0;
        for (i = i1; i < version1.length(); ++i) {
            if (version1.charAt(i) == '.') break;
            v1 = v1 * 10 + version1.charAt(i) - '0';
        }
        
        // next i1
        i1 = i + 1;
        
        // calculate v2.
        i = 0;
        for (i = i2; i < version2.length(); ++i) {
            if (version2.charAt(i) == '.') break;
            v2 = v2 * 10 + version2.charAt(i) - '0';
        }
        
        // next i2
        i2 = i + 1;
          
        if (v1 > v2) return 1;
        if (v1 < v2) return -1;
        return compare(version1, i1, version2, i2);
    }
}
