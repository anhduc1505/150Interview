import java.util.HashMap;

public class MinLenAfterOperation_3223 {
    public int minimumLength1(String s){
        int res = 0;
        HashMap<Character, Integer> charFreq = new HashMap<>();
        for(char c : s.toCharArray()){
            charFreq.put(c, charFreq.getOrDefault(c, 0) + 1);
        }

        int delChar = 0;

        for (int freq : charFreq.values()){
            if(freq == 2 || freq == 1){
                continue;
            }
            else if(freq % 2 != 0){
                delChar+= freq - 1;
            }
            else {
                delChar+= freq - 2;
            }
        }
        return s.length() - delChar;
    }

    public int minimumLength2(String s){
        int res = 0;
        int[] freq = new int[26];

        for (char c : s.toCharArray()){
            freq[c - 'a']++;
        }

        for (int i : freq){
            if(i == 0) continue;
            else if (i % 2 == 0) {
                res+=2;
            }
            else {
                res+=1;
            }
        }
        return res;
    }


    //đang sai 
    public int minimumLength3(String s){
        int res = 0;
        HashMap<Character, Integer> charFreq = new HashMap<>();
        for(char c : s.toCharArray()){
            charFreq.put(c, charFreq.getOrDefault(c, 0) + 1);
        }

        int delChar = 0;

        for (int freq : charFreq.values()){
            if(freq % 2 != 0){
                res+=2;
            }
            else {
                res+=1;
            }
        }
        return res;
    }
}
