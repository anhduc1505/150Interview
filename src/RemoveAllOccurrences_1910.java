public class RemoveAllOccurrences_1910 {
    public String removeOccurrences(String s, String part) {
        while (s.contains(part)){
            s = s.replaceFirst(part, "");
        }
        return s;
    }

    public String removeOccurrences2(String s, String part) {
        StringBuilder sb = new StringBuilder();
        int index;
        while ((index = sb.indexOf(part)) != -1){
            sb.delete(index, index + part.length());
        }
        return sb.toString();
    }

    public String removeOccurrences3(String s, String part) {
        // Sử dụng mảng char như một stack để xây dựng chuỗi kết quả
        char[] stack = new char[s.length()];
        int stackIndex = 0; // Con trỏ giữ vị trí trong stack
        int partLength = part.length(); // Độ dài của chuỗi cần loại bỏ

        // Duyệt qua từng ký tự trong chuỗi đầu vào
        for (char c : s.toCharArray()) {
            stack[stackIndex++] = c; // Đưa ký tự vào stack

            // Kiểm tra nếu stack chứa đủ độ dài của chuỗi cần loại bỏ
            if (stackIndex >= partLength) {
                boolean match = true;
                // So sánh từng ký tự trong stack với chuỗi cần loại bỏ
                for (int i = 0; i < partLength; i++) {
                    if (stack[stackIndex - partLength + i] != part.charAt(i)) {
                        match = false;
                        break;
                    }
                }
                // Nếu tìm thấy phần tử trùng khớp, lùi stackIndex để loại bỏ
                if (match) {
                    stackIndex -= partLength;
                }
            }
        }
        // Chuyển stack thành chuỗi đầu ra
        return new String(stack, 0, stackIndex);
    }
}
