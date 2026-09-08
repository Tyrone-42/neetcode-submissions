class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);

            if (!Character.isLetterOrDigit(leftChar)) {
                left++;
                continue;
            }

            if (!Character.isLetterOrDigit(rightChar)) {
                right--;
                continue;
            }

            char lowCharLeft = Character.toLowerCase(leftChar);
            char lowCharRight = Character.toLowerCase(rightChar);

            if (lowCharLeft != lowCharRight) {
                return false;
                
            }
            left++;
            right--;
        } return true;
        
    }
}
