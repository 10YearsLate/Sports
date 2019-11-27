import java.util.*;

import javafx.scene.control.SplitPane.Divider;

import java.io.*;
import java.lang.*;

public class A{

    public static void main(String[] args){

        long start = System.currentTimeMillis();
	
		remedy();
		
		long end = System.currentTimeMillis();
		float sec = (end - start) / 1000F; 
		//System.out.println(sec + " seconds");
    }

    private static void remedy() {

        Scanner sc=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n=sc.nextInt();
        while(n-->0){
            long c=sc.nextInt();
            long sum=sc.nextInt();
            long d=sum/c;
            long r=sum%c;
            long res= ((c-r)*d*d) + (r*(d+1)*(d+1));
            System.out.println(res);
        }

    }
}
