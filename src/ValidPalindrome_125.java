public class ValidPalindrome_125 {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()) return true;

        int l = 0, r = s.length() - 1;

        while(l < r){
            char curL = s.charAt(l);
            char curR = s.charAt(r);
            if(!Character.isLetterOrDigit(curL)){
                l++;
            }
            else if(!Character.isLetterOrDigit(curR)){
                r--;
            }
            else {
                if(Character.toLowerCase(curL) != Character.toLowerCase(curR)){
                    return false;
                }
                l++;
                r--;
            }
        }

        return true;
    }
}
