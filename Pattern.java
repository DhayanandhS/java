import java.util.*;
public class Pattern {
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        int n=S.nextInt();
        for(int i=1;i<n;i++){
            for(int j=n-1;j>0;j--){
                System.out.print(j);
            }
            System.out.println();
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<n;j++){
                System.out.print(i);
            }
            System.out.println();
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<n;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
