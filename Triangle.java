import java.util.*;
public class Triangle
{
	public static void main(String[] args) 
	{
		 // write your code !!
		 Scanner s=new Scanner(System.in);
		 int n=s.nextInt();  
		 for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
		   
}
