import java.util.HashSet;
import java.util.Set;

public class PrefixCommon2Array_2657 {
    public int[] findThePrefixCommonArray1(int[] A, int[] B) {
        int n = A.length;
        int[] ans = new int[n];

        Set<Integer> conA = new HashSet<>();
        Set<Integer> conB = new HashSet<>();

        for(int i = 0; i < n; i++){
            conA.add(A[i]);
            conB.add(B[i]);

            int commonCNT = 0;

            for(int j : conA){
                if(conB.contains(j)){
                    commonCNT++;
                }
            }

            ans[i] = commonCNT;
        }

        return ans;
    }

    public int[] findThePrefixCommonArray2(int[] A, int[] B) {
        int n = A.length;
        int[] ans = new int[n];
        int[] frequency = new int[n + 1];
        int commonCNT = 0;

        for(int i = 0; i < n; i++){

            frequency[A[i]]++;
            if(frequency[A[i]] == 2) commonCNT++;

            frequency[B[i]]++;
            if(frequency[B[i]] == 2) commonCNT++;

            ans[i] = commonCNT;
        }

        return ans;
    }
}
