import java.util.*;

import java.io.*;

import java.lang.System.*;

public class solutionA1{


	public static void main(String[] args){
		
		long start = System.currentTimeMillis();
	
		remedy();
		
		long end = System.currentTimeMillis();
		float sec = (end - start) / 1000F; 
		System.out.println(sec + " seconds");
	
	}
	
	public static void remedy(){
		
		Scanner sc=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		
		int T=sc.nextInt();
		while(T-->0){
	
		int N=sc.nextInt();
		int M=sc.nextInt();
		int[] a=new int[N];
		for(int i=0;i<N;i++) a[i]=sc.nextInt();
		
		int sum;
		
		boolean flag=false;
		
		for(int i=0;i<(1<<N);i++){
			
			sum=0;
			for(int j=0;j<N;j++){
				
				 if((i&(1<<j))>0){
					 
					 sum+=a[j];
					 //System.err.println(T+"     "+a[j]);
					 
				 }
				 
			}
			
			if(sum==M) {System.out.println("Yes");flag=true;break;}
		
		}
		
		if(!flag) System.out.println("No");
		
		}
		
	}


}
