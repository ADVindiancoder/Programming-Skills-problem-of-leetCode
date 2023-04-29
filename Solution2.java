public class Solution2 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test cases
        String s1 = "bank";
        String s2 = "kanb";
        System.out.println(solution.areAlmostEqual(s1, s2)); // Expected output: true
        
        s1 = "attack";
        s2 = "defend";
        System.out.println(solution.areAlmostEqual(s1, s2)); // Expected output: false
        
        s1 = "kelb";
        s2 = "kelb";
        System.out.println(solution.areAlmostEqual(s1, s2)); // Expected output: true
    }
}

class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if (s1.equals(s2)) {
            return true;
        }
        int n = s1.length();
        int diffCount = 0;
        int[] diffIndexes = new int[2];
        for (int i = 0; i < n; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (diffCount == 2) {
                    return false;
                }
                diffIndexes[diffCount++] = i;
            }
        }
        return diffCount == 2 && s1.charAt(diffIndexes[0]) == s2.charAt(diffIndexes[1]) && s1.charAt(diffIndexes[1]) == s2.charAt(diffIndexes[0]);
    }
}
