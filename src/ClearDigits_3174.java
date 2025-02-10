import java.util.Stack;

public class ClearDigits_3174 {
    public String clearDigits1(String s) {
        int charIndex = 0;
        StringBuilder sb = new StringBuilder(s);
        while (charIndex < sb.length()) {
            if(Character.isDigit(sb.charAt(charIndex))){
                sb.deleteCharAt(charIndex);
                if(charIndex > 0){
                    sb.deleteCharAt(charIndex - 1);
                    charIndex--;
                }
            }
            else {
                charIndex++;
            }
        }
        return sb.toString();
    }

    public String clearDigits2(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (Character c : s.toCharArray()){
            if(Character.isDigit(c)){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
            else {
                stack.push(c);
            }
        }

        for (char c : stack){
            sb.append(c);
        }
        return sb.toString();
    }
}
