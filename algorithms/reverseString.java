import java.util.Arrays;

class Solution {
    public void reverseString(char[] s) {
        int left = 0, right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test Case 1: Regular string
        char[] test1 = {'h', 'e', 'l', 'l', 'o'};
        System.out.println("Test 1:");
        System.out.println("Before: " + Arrays.toString(test1));
        solution.reverseString(test1);
        System.out.println("After:  " + Arrays.toString(test1));
        System.out.println();
        
        // Test Case 2: Even length string
        char[] test2 = {'H', 'a', 'n', 'n', 'a', 'h'};
        System.out.println("Test 2:");
        System.out.println("Before: " + Arrays.toString(test2));
        solution.reverseString(test2);
        System.out.println("After:  " + Arrays.toString(test2));
        System.out.println();
        
        // Test Case 3: Single character
        char[] test3 = {'a'};
        System.out.println("Test 3:");
        System.out.println("Before: " + Arrays.toString(test3));
        solution.reverseString(test3);
        System.out.println("After:  " + Arrays.toString(test3));
        System.out.println();
        
        // Test Case 4: String with mixed characters
        char[] test4 = {'1', '2', '3', '!', '@', '#'};
        System.out.println("Test 4:");
        System.out.println("Before: " + Arrays.toString(test4));
        solution.reverseString(test4);
        System.out.println("After:  " + Arrays.toString(test4));
        System.out.println();
    }
}