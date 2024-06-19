public class Solution {
    public static void nLetterTriangle(int n) {
        for(int i=0; i<n; i++){
            for(char j='A'; j<='A'+n-i-1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
