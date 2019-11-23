import java.util.*;

import java.io.*;

public class sola2 {

	public static void main(String[] args){
	
		long start = System.currentTimeMillis();
	
		remedy();
		
		long end = System.currentTimeMillis();
		float sec = (end - start) / 1000F; 
		System.out.println(sec + " seconds");
	
	}
	
	public static void remedy(){
		
		boolean flag=true;
		
		Scanner sc=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		
		int t=sc.nextInt();
		
		while(t-->0){
		
		int k=sc.nextInt();
	
        int[] leaves=new int[k];
        
		
        
        int expected=1;
		
		for(int i=0;i<k;i++){
			
            leaves[i]=sc.nextInt();
            
            flag=true;
		
			
            if(leaves[i]>expected) {flag=false;break;} 
            if(!flag) break;
            expected=(expected-leaves[i])*2;
			
			
		}
		if(expected!=0) {flag=false;}
		
		if(flag) System.out.println("Yes");
		else System.out.println("No");
		
		}
	
	}

}

