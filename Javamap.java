package hackerrankproblems;

import java.util.HashMap;
import java.util.Scanner;

public class Javamap {
        public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        HashMap<String, Integer> map=new HashMap();
        int n=sc.nextInt();
        sc.nextLine();
        while(n-->0)
        {
            String name=sc.nextLine();
            int number=sc.nextInt();
            map.put(name, number);
            sc.nextLine();
        }
        String s;
        while(sc.hasNext()) {
            s=sc.nextLine();
            if (map.containsKey(s)) {
                System.out.println(s + "=" + map.get(s));
            } else {
                System.out.println("Not found");
            }
        }
        sc.close();
	}
        }
