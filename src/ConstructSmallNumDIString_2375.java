import java.util.Stack;

public class ConstructSmallNumDIString_2375 {
    public String smallestNumber(String pattern){
        Stack<Integer> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int num = 1;

        for (int i = 0; i < pattern.length(); i++){
            if(pattern.charAt(i) == 'I'){
                st.push(num++);
                while(!st.isEmpty()){
                    sb.append(st.pop());
                }
            }
            else {
                st.push(num++);
            }
        }

        return sb.toString();
    }
}
