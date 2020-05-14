import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String[] str=s.trim().split("[ !,?._'@]+");
        if(s.trim().equals("")) 
        {
            System.out.println("0");
        }
        else if(s.length()>400000)
        {
            return;
        }
        else
        {
        System.out.println(str.length);
        }for(String  a : str) 
        System.out.println(a);
        scan.close();
    } 
}

