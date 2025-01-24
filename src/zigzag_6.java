public class zigzag_6 {
    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) {
            return s; // Nếu chỉ có 1 hàng hoặc chuỗi quá ngắn, không cần ziczac
        }

        // Tạo danh sách để lưu các hàng
        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int curRow = 0; // Hàng hiện tại
        boolean goingDown = false; // Hướng di chuyển (ban đầu là đi lên)

        // Duyệt qua từng ký tự
        for (char c : s.toCharArray()) {
            rows[curRow].append(c); // Thêm ký tự vào hàng hiện tại

            // Đổi hướng khi đến hàng đầu hoặc hàng cuối
            if (curRow == 0) {
                goingDown = true;
            } else if (curRow == numRows - 1) {
                goingDown = false;
            }

            // Cập nhật hàng hiện tại
            if (goingDown) {
                curRow++;
            } else {
                curRow--;
            }
        }

        // Ghép các hàng lại thành chuỗi kết quả
        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }
}
