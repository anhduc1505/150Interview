import java.util.Arrays;

public class LongCommonPre_14 {
    public String longestCommonPrefix(String[] strs) {
        // Edge case: Empty array
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Sort the array
        Arrays.sort(strs);

        // First and last strings in the sorted array
        String first = strs[0];
        String last = strs[strs.length - 1];
        int minLength = Math.min(first.length(), last.length());

        // Compare characters of the first and last strings
        int i = 0;
        while (i < minLength && first.charAt(i) == last.charAt(i)) {
            i++;
        }

        // Return the common prefix
        return first.substring(0, i);
    }
}
