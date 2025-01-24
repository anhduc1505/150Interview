public class countPreAndSufPairs {
    class Solution {
        public int countPrefixSuffixPairs(String[] words) {
            int cnt = 0;

            for (int i = 0; i < words.length; i++) {
                for (int j = i + 1; j < words.length; j++) {
                    int len1 = words[i].length();
                    int len2 = words[j].length();

                    // Kiểm tra nếu words[i] có thể là prefix và suffix của words[j]
                    if (len1 <= len2) {
                        String prefix = words[j].substring(0, len1); // Tiền tố của words[j]
                        String suffix = words[j].substring(len2 - len1); // Hậu tố của words[j]

                        // So sánh nội dung chuỗi
                        if (words[i].equals(prefix) && words[i].equals(suffix)) {
                            cnt++;
                        }
                    }
                }
            }

            return cnt;
        }

        public int countPrefixSuffixPairs1(String[] words) {
            int res = 0;

            for (int i = 0; i < words.length - 1; i++) {
                for (int j = i + 1; j < words.length; j++) {
                    if (isPrefixAndSuffix(words[i], words[j])) {
                        res += 1;
                    }
                }
            }
            return res;
        }

        boolean isPrefixAndSuffix(String s1, String s2) {
            return s2.startsWith(s1) && s2.endsWith(s1);
        }
    }
}
