import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;
public class Day7
{
    public static void main(String args[]){
        try{
            InputStreamReader ip = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(ip);
        String i = bf.readLine();
        /* int integer = Integer.parseInt(i); */
        System.out.println(i);
        }
        catch(Exception e){
            System.out.println("An error occurred while reading input: " + e.getMessage());
        }
        
    }
}