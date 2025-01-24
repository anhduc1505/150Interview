public class checkparentheses_2116 {
    public static boolean canbeValid(String s, String locked){
        if(s.length() % 2 != 0) return false;

        int openCnt = 0;
        int freeCnt = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                openCnt++;
            }
            else if (locked.charAt(i) == '0'){
                freeCnt++;
            }
            else{
                openCnt--;
            }


            //kiem tra som tai neu thua ) thi freeslot cung k sua dc
            if(freeCnt + openCnt < 0){
                return false;
            }

        }

        int closeCnt = 0;
        freeCnt = 0;
        for(int i = s.length() - 1; i > 0; i--){
            if(locked.charAt(i) == '0'){
                freeCnt++;
            }
            else if (s.charAt(i) == ')'){
                closeCnt++;
            }
            else {
                closeCnt--;
            }

            if(closeCnt + freeCnt < 0){
                return false;
            }
        }

        return true;
    }
}
