import java.util.HashMap;
import java.util.Map;

public class ConstructKPalindromeString {
    public boolean canConstruct1(String s, int k){
        if(s.length() < k) return false;
        if(s.length() == k) return true;

        int[] freq = new int[26];
        int oddCnt = 0;

        for(char c : s.toCharArray()){
            freq[c - 'a']++;
        }

        for(int cnt : freq){
            if(cnt % 2 != 0){
                oddCnt++;
            }
        }

        return oddCnt <= k;
    }

    public boolean canConstruct2(String s, int k){
        Map<Character, Integer> charCnt = new HashMap<>();
        for(char c : s.toCharArray()){
            charCnt.put(c, charCnt.getOrDefault(c, 0) + 1);
        }

        int oddCnt = 0;
        for(int cnt : charCnt.values()){
            if(cnt % 2 != 0){
                oddCnt++;
            }
        }

        if(k < oddCnt || k > s.length()){
            return false;
        }
        return true;
    }
}
