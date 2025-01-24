//import java.util.*;
//
//class WordSubsets {
//
//    private Map<Character, Integer> getCharFreq(String s){
//        Map<Character, Integer> ans = new HashMap<>();
//        for(char c : s.toCharArray()){
//            ans.put(c, ans.getOrDefault(c, 0) + 1);
//        }
//        return ans;
//    }
//
//    public List<String> wordSubsets(String[] words1, String[] words2) {
//        List<String> ans = new ArrayList<>();
//
//        Map<Character, Integer> cntMap = new HashMap<>();
//        for(String i : words2){
//            Map<Character, Integer> tempMap = getCharFreq(i);
//            for(Map.Entry<Character, Integer> entry : tempMap.entrySet()){
//                char c = entry.getKey();
//                int freq = entry.getValue();
//                cntMap.put(c, Math.max(cntMap.getOrDefault(c, 0), freq));
//            }
//        }
//
//        for(String i : words1){
//            Map<Character, Integer> tempMap = getCharFreq(i);
//            boolean check = true;
//            for(Map.Entry<Character, Integer> entry : cntMap.entrySet()){
//                char c = entry.getKey();
//                int required = entry.getValue();
//                if(tempMap.getOrDefault(c, 0) < required){
//                    check = false;
//                    break;
//                }
//            }
//            if(check){
//                ans.add(i);
//            }
//        }
//
//        return ans;
//    }
//}

import java.util.*;

class WordSubsets {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> ans = new ArrayList<>();

        // Tạo một bảng ký tự tổng hợp cho words2
        int[] maxFreq = new int[26]; // Lưu trữ tần suất tối đa của mỗi ký tự từ words2
        for (String word : words2) {
            int[] freq = getCharFrequency(word);
            for (int i = 0; i < 26; i++) {
                maxFreq[i] = Math.max(maxFreq[i], freq[i]);
            }
        }

        // Kiểm tra từng từ trong words1
        for (String word : words1) {
            int[] freq = getCharFrequency(word);
            boolean isUniversal = true;
            for (int i = 0; i < 26; i++) {
                if (freq[i] < maxFreq[i]) {
                    isUniversal = false;
                    break;
                }
            }
            if (isUniversal) {
                ans.add(word);
            }
        }

        return ans;
    }

    // Hàm tính tần suất ký tự của một từ
    private int[] getCharFrequency(String word) {
        int[] freq = new int[26];
        for (char c : word.toCharArray()) {
            freq[c - 'a']++;
        }
        return freq;
    }

    public static void main(String[] args) {
        WordSubsets ws = new WordSubsets();
        String[] words1 = {"amazon", "apple", "facebook", "google", "leetcode"};
        String[] words2 = {"e", "o"};

        List<String> result = ws.wordSubsets(words1, words2);
        System.out.println(result); // Output: [facebook, google, leetcode]
    }
}
