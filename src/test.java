import java.lang.reflect.Array;
import java.util.Arrays;

class Test {
    public boolean isSubsequence(String s, String t) {
        int iS = 0;
        int iT = 0;
        while(iS < s.length() || iT < t.length()){
            if(s.charAt(iS) != t.charAt(iT)){
                iT++;
            }
            iS++;
        }
        return iS == s.length();
    }
}