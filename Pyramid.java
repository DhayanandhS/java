import java.util.*;
public class Pyramid {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        for(int i=1;i<=N;i++){
            /*for(int j=1;j<=N-i;j++){
                System.out.print(" ");
            }*/
            for(int k=1;k<=(2*i)-1;k++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
