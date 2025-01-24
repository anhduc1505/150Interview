public class reverseString_151 {
    public String reverseWords(String s) {
        String ans = "";
        String[] a = s.split("\\s+");
        for (int i = a.length - 1; i >= 0; i-- ){
            ans+= a[i] + " ";
        }
        return ans.trim();
    }
}
