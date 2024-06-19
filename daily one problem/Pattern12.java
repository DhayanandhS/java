public class Solution {
    public static void numberCrown(int n) {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            for(int k=1; k<2*n-2; k++){
                System.out.print(" ");
            }
            for(int l=i; l>=1; l--){
                System.out.print(l+" ");
            }
            System.out.println();
        }
    }
}
