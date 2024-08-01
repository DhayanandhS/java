class Solution {

    void printNos(int N) {
        for(int i = N; i >= 1; i--){
            if(i<1){
                return;
            }
            System.out.print(i+" ");
        }
    }
}